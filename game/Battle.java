package game;

import pokemon.Pokemon;

import java.util.Scanner;

public class Battle{
    public double userBattleSpeed, wildBattleSpeed, wildremainingHealth;
    public int currentID;

    public void startBattle(Player user, Options option) {
        //int chance;
        currentID = 0;
        //chance = (int) getChance();
        Pokemon wild = Pokemon.wildPokemon(user);
        System.out.println("A wild " + wild.getName() + " has appeared!");

        while (user.party[currentID].getHealth() == 0){
            currentID++;
        }
        System.out.println("Go " + user.party[currentID].getName() + "!");
        wildremainingHealth = wild.getHealthPoints();
        userBattleSpeed = user.party[currentID].getSpeed();
        wildBattleSpeed = wild.getSpeed();
        displayHealth(wild, user);
        battle(user, wild, option);
    }

    private void battle(Player user, Pokemon wild, Options option){
        if(wildremainingHealth > 0 && user.party[currentID].getHealth() > 0){
            if (wildBattleSpeed > userBattleSpeed){
                wildAttackPhase(user, wild, option); //needs to be moved, wild can attack before user selects a move

            } else if (userBattleSpeed >= wildBattleSpeed) {
                playerAttackPhase(user, wild, option);
            }
        } else if (wildremainingHealth <= 0){ //currently only for just incase something goes weird
            wildLose(wild, user, option);
        } else if (user.party [currentID].getHealth() <= 0){ //same with this
            System.out.println("You have been defeated!"); // needs to check all party pokemon
            System.exit(0);
        }
    }

    public void playerAttackPhase(Player user, Pokemon wild, Options option){
        Scanner scan = new Scanner(System.in);
        String action;
        int run;

        System.out.println("What should " + user.party[0].getName() + " do?");
        System.out.println("1. Fight   2. Bag");
        System.out.println("3. Pokemon 4. Run");
        action = scan.nextLine();

        if (action.equalsIgnoreCase("1")){
            System.out.println("Select a move by entering the corresponding number. Enter -1 to go back");
            wildremainingHealth = actionFightUser(user, wild, option);
            wildremainingHealth = Math.round(wildremainingHealth);
            if (wildremainingHealth < 0){
                wildremainingHealth = 0;
            }
            displayHealth(wild, user);
            if (wildremainingHealth <= 0){ //this works
                wildLose(wild, user, option);
            } else {
                wildAttackPhase(user, wild, option);
            }
        } else if (action.equalsIgnoreCase("2")){
            user.getInventory().useItem(user,this, wild, option);
        } else if (action.equalsIgnoreCase("3")){
            user.getPartyPokemon(); //switching pokemon and selecting stats needs added
            selectPokemon(user,wild,option);
            playerAttackPhase(user, wild, option);
        } else if (action.equalsIgnoreCase("4")){
            run = (int) getChance();
            if (run > 50){
                System.out.println("Got away safely");
                option.options(option.optionsMenu(), user);
            } else {
                System.out.println("Could not escape");
                wildAttackPhase(user, wild, option);
            }
        } else {
            System.out.print("Please enter an applicable number! ");
            playerAttackPhase(user, wild, option);
        }
    }

    private void displayHealth(Pokemon wild, Player user){
        System.out.println("LV: " + wild.getLevel() + " " + wild.getName());
        System.out.println("HP: " + wildremainingHealth + "/" + wild.getHealthPoints());
        System.out.println("LV: " + user.party[currentID].getLevel() + " " + user.party[currentID].getName());
        System.out.println("HP: " + user.party[currentID].getHealth() + "/" + user.party[currentID].getHealthPoints());
    }

    public void wildAttackPhase(Player user, Pokemon wild, Options option){
        double a = Math.random() * 3, multiplier;
        int att = (int) a;
        checkWildAttack(wild, att);

        System.out.println("The wild " + wild.getName() + " used " + wild.att[att]);
        double damage = 0;
        multiplier = getModifier();

        if (wild.att[att].isPhysical()){
            damage = ((2 * wild.getLevel() + 10) / 250) * (wild.getAttack() / user.party[0].getDefense()) * (wild.att[att].getPower() + 2) * multiplier;
        } else {
            damage = ((2 * wild.getLevel() + 10) / 250) * (wild.getSpecialAttack() / user.party[0].getSpecialDefense()) * (wild.att[att].getPower() + 2) * multiplier;
        }
        damage = Math.round(damage);
        System.out.println("It did " + damage + " damage");
        user.party [currentID].setHealth(Math.round(user.party[currentID].getHealth() - damage));
        if (user.party[currentID].getHealth() < 0){
            user.party[currentID].setHealth(0);
        }
        displayHealth(wild, user);
        if (user.party [currentID].getHealth() <= 0){//needs to account for whole team.
            System.out.println("You have been defeated!");
            System.exit(0);
        } else {
            playerAttackPhase(user, wild, option);
        }
    }

    public void wildLose(Pokemon wild, Player user, Options option){
        double chance = getChance();
        System.out.println("The " + wild.getName() + " has fainted!");
        System.out.println("You gained 50 exp, 100 pokemon exp, and 100 pokedollars!"); //currently constant,change later to depend of the pokemon
        if (chance < 70){
            user.getInventory().addRandomItem();
        }
        user.gainExperience();
        user.gainPokedollars();
        user.gainExperiencePokemon(currentID);//needs to also send current ID to give the correct Pokemon the EXP
        option.options(option.optionsMenu(), user);
    }

    private void checkWildAttack(Pokemon wild, int att){
        double a;
        while (wild.att[att].equals("-----")) {
            a = Math.random() * 3;
            att = (int) a;
        }
    }

    private double actionFightUser(Player user, Pokemon wild, Options option){
        Scanner scan = new Scanner(System.in);
        double damage;

        System.out.println("1. " + user.party[currentID].att[0] + "  2. " + user.party[currentID].att[1]);
        System.out.println("3. " + user.party[currentID].att[2] + "  4. " + user.party[currentID].att[3]);
        //System.out.println("Enter -1 to go back");
        int attack = scan.nextInt();
        if (attack == -1){
            playerAttackPhase(user, wild, option);
        } else if (attack != 1 && attack != 2 && attack != 3 && attack != 4) {
            System.out.print("Please enter an applicable number!");
            actionFightUser(user, wild, option);
        }
        damage = damageCalculatorUser(attack, wild, option, user);
        damage = Math.round(damage);
        System.out.println("It did " + damage + " damage");
        wildremainingHealth = wildremainingHealth - damage;

        return wildremainingHealth;
    }

    private int damageCalculatorUser(int attack, Pokemon wild, Options option, Player user){
        int att = attack - 1, d = 0;
        double damage, multiplier;

        multiplier = getModifier();

        if (user.party[currentID].att[att].getName().equalsIgnoreCase("-----")) { //not working
            System.out.println("Invalid Move");
            actionFightUser(user, wild, option);
        }

        if (user.party[currentID].att[att].isPhysical()){
            damage = (2 * user.party[currentID].getLevel() + 10) / 250 * (user.party[currentID].getAttack() / wild.getDefense()) * (user.party[currentID].att[att].getPower() + 2) * multiplier;
            d = (int) damage;
        } else {
            damage = ((2 * user.party[currentID].getLevel() + 10) / 250) * (user.party[currentID].getSpecialAttack() / wild.getSpecialDefense()) * (user.party[currentID].att[att].getPower() + 2) * multiplier;
            d = (int) damage;
        }

        return d;
    }

    public void selectPokemon(Player user, Pokemon wild, Options option){ //will need exceptions for sending out if fainted
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a pokemon by entering its slot number");
        int s = scan.nextInt();
        while (s > 6 || s < 1){
            System.out.println("Please enter a valid slot!");
            s = scan.nextInt();
        }
        optionPokemon(s,user,wild,option);
    }

    public void optionPokemon(int s, Player user, Pokemon wild, Options option){
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do with " + user.party[s - 1].getName() + " ?");
        System.out.println("1. Switch\n2.Summary\n3.Check Moves\n-1. Go Back");
        int c = scan.nextInt();
        switch (c){
            case 1:
                if (s == currentID + 1){
                    System.out.println("That Pokemon is already in battle!");
                    optionPokemon(s,user,wild,option);
                } else {
                    System.out.println("That's enough " + user.party[currentID].getName() + "!");
                    currentID = s - 1;
                    System.out.println("Go " + user.party[currentID].getName() + "!");
                    wildAttackPhase(user,wild,option);
                }
                break;
            case 2:
                s = s - 1;
                System.out.println("Name: " + user.party[s].getName());
                System.out.println("Level: " + user.party[s].getLevel());
                System.out.println("Attack: " + user.party[s].getAttack());
                System.out.println("Deffense: " + user.party[s].getDefense());
                System.out.println("Special Attack: " + user.party[s].getSpecialAttack());
                System.out.println("Special Deffence: " + user.party[s].getSpecialDefense());
                System.out.println("Speed: " + user.party[s].getSpeed());
                //System.out.println("HP: " + remainingHealth[s] + "/" + party[0].getHealthPoints());
                //System.out.println("EXP: " + pokemonExp[s] + " / " + toLevelUpPokemon);
                System.out.println("Enter -1 to go back.");
                int k = scan.nextInt();
                while (k != -1){
                    System.out.println("Please enter -1 to go back!");
                    k = scan.nextInt();
                }
                s++;
                optionPokemon(s,user,wild,option);
                break;
            case 3:
                System.out.println("Coming soon!");
                break;
            case -1:
                selectPokemon(user,wild,option);
                break;
        }
    }

    private double getChance(){
        double chance = 1 + Math.random() * (100 - 1);
        chance = Math.round(chance);

        return chance;
    }

    private double getModifier(){
        double c = getCriticalMultiplier(), r =getRandomMultiplier(), multiplier;
        multiplier = c * r;
        return multiplier;
    }

    //public double getEffectivityMultiplier(){
        //if (user.attType1[attack] = "Fire" && wild.getElementalType)
    //}

    //public double getStabMultiplier(){

    //}

    private int getCriticalMultiplier(){
        double c = Math.random() * (10);
        int a = (int) Math.round(c);
        if (a == 10){
            a = 2;
            System.out.println("It was a Critical Hit!");
        } else {
            a = 1;
        }
        return a;
    }

    private double getRandomMultiplier(){
        double r = .85 + Math.random() * (1 - .85);
        return r;
    }

    private void getGoBack(Player user, Options option, Pokemon wild){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter -1 to go back");
        int one = scan.nextInt();
        if (one == -1){
            playerAttackPhase(user, wild, option);
        }
        while (one != -1){
            System.out.println("Invalid number entered. Please Enter -1 to go back");
            one = scan.nextInt();
            if (one == -1){
                playerAttackPhase(user, wild, option);
            }
        }
    }

}