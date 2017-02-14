package game;

import pokemon.Pokemon;

import java.util.Scanner;

public class Battle{
    private double userBattleSpeed, wildBattleSpeed, wildremainingHealth;
    private int currentID;

    public void startBattle(Player user, Options option, Pokedex pokedex) {
        currentID = 0;
        Pokemon wild = Pokemon.wildPokemon(user);
        System.out.println("A wild " + wild.getName() + " has appeared!");

        while (user.party[currentID].getHealth() == 0 && !user.party[currentID].getName().equalsIgnoreCase("Empty")){
            currentID++;
        } //check to make sure slots are not empty
        System.out.println("Go " + user.party[currentID].getName() + "!");
        wildremainingHealth = wild.getHealthPoints();
        userBattleSpeed = user.party[currentID].getSpeed();
        wildBattleSpeed = wild.getSpeed();
        displayHealth(wild, user);
        battle(user, wild, option, pokedex);
    }

    private void battle(Player user, Pokemon wild, Options option, Pokedex pokedex){
        if(wildremainingHealth > 0 && user.party[currentID].getHealth() > 0){
            if (wildBattleSpeed > userBattleSpeed){
                wildAttack(user, wild, option, pokedex); //needs to be moved, wild can attack before user selects a move

            } else if (userBattleSpeed >= wildBattleSpeed) {
                playerPhase(user, wild, option, pokedex);
            }
        } else if (wildremainingHealth <= 0){ //currently only for just incase something goes weird
            wildLose(wild, user, option, pokedex);
        } else if (user.party [currentID].getHealth() <= 0){ //same with this
            System.out.println("You have been defeated!"); // needs to check all party pokemon
            System.exit(0);
        }
    }

    public void playerPhase(Player user, Pokemon wild, Options option, Pokedex pokedex){
        Scanner scan = new Scanner(System.in);
        String action;
        int run;

        System.out.println("What should " + user.party[0].getName() + " do?");
        System.out.println("1. Fight   2. Bag");
        System.out.println("3. Pokemon 4. Run");
        action = scan.nextLine();

        if (action.equalsIgnoreCase("1")){
            System.out.println("Select a move by entering the corresponding number. Enter -1 to go back");
            wildremainingHealth = playerAttack(user, wild, option, pokedex);
            wildremainingHealth = Math.round(wildremainingHealth);
            if (wildremainingHealth < 0){
                wildremainingHealth = 0;
            }
            displayHealth(wild, user);
            if (wildremainingHealth <= 0){
                wildLose(wild, user, option, pokedex);
            } else {
                wildAttack(user, wild, option, pokedex);
            }
        } else if (action.equalsIgnoreCase("2")){
            user.getInventory().useItem(user,this, wild, option, pokedex);
        } else if (action.equalsIgnoreCase("3")){
            selectPokemon(user,wild,option, pokedex);
        } else if (action.equalsIgnoreCase("4")){
            run = (int) getChance();
            if (run > 50){
                System.out.println("Got away safely");
                option.options(option.optionsMenu(), user, pokedex);
            } else {
                System.out.println("Could not escape");
                wildAttack(user, wild, option, pokedex);
            }
        } else {
            System.out.print("Please enter an applicable number! ");
            playerPhase(user, wild, option, pokedex);
        }
    }

    private double playerAttack(Player user, Pokemon wild, Options option, Pokedex pokedex){
        Scanner scan = new Scanner(System.in);
        double damage;

        System.out.println("1. " + user.party[currentID].att[0] + "  2. " + user.party[currentID].att[1] + "\n3. " + user.party[currentID].att[2] + "  4. " + user.party[currentID].att[3]);
        System.out.println("Enter -1 to go back");
        int attack = scan.nextInt();
        if (attack == -1){
            playerPhase(user, wild, option, pokedex);
        } else if (attack < 1 && attack > 4) {
            System.out.print("Please enter an applicable number!");
            playerAttack(user, wild, option, pokedex);
        }
        damage = playerDamageCalc(attack, wild, option, user, pokedex);
        damage = Math.round(damage);
        System.out.println("It did " + damage + " damage");
        wildremainingHealth = wildremainingHealth - damage;

        return wildremainingHealth;
    }

    private int playerDamageCalc(int attack, Pokemon wild, Options option, Player user, Pokedex pokedex){
        int att = attack - 1, d = 0;
        double damage, multiplier;

        multiplier = getModifier();

        if (user.party[currentID].att[att].getName().equalsIgnoreCase("-----")) { //not working
            System.out.println("Invalid Move");
            playerAttack(user, wild, option, pokedex);
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

    private void displayHealth(Pokemon wild, Player user){
        System.out.println("LV: " + wild.getLevel() + " " + wild.getName());
        System.out.println("HP: " + wildremainingHealth + "/" + wild.getHealthPoints());
        System.out.println("LV: " + user.party[currentID].getLevel() + " " + user.party[currentID].getName());
        System.out.println("HP: " + user.party[currentID].getHealth() + "/" + user.party[currentID].getHealthPoints());
    }

    public void wildAttack(Player user, Pokemon wild, Options option, Pokedex pokedex){
        double a = Math.random() * 3, multiplier;
        int att = (int) a;
        //checkWildAttack(wild, att);

        System.out.println("The wild " + wild.getName() + " used " + wild.att[att]);
        double damage;
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
            playerPhase(user, wild, option, pokedex);
        }
    }

    public void wildLose(Pokemon wild, Player user, Options option, Pokedex pokedex){
        double chance = getChance();
        System.out.println("The " + wild.getName() + " has fainted!");
        System.out.println("You gained 50 exp, 100 pokemon exp, and 100 pokedollars!"); //currently constant,change later to depend of the pokemon
        if (chance < 70){
            user.getInventory().addRandomItem();
        }
        user.gainExperience();
        user.gainPokedollars();
        user.gainEVs(currentID, wild.getAtkEVG(), wild.getDefEVG(), wild.getSpAtkEVG(), wild.getSpDefEVG(), wild.getSpdEVG(), wild.getHpEVG());
        user.gainExperiencePokemon(currentID, pokedex);
        option.options(option.optionsMenu(), user, pokedex);
    }

    //private void checkWildAttack(Pokemon wild, int att){ //doesnt work
        //double a;
        //while (wild.att[att].equals("-----")) {
            //a = Math.random() * 3;
            //att = (int) a;
        //}
    //}

    public void selectPokemon(Player user, Pokemon wild, Options option, Pokedex pokedex){ //will need exceptions for sending out if fainted
        Scanner scan = new Scanner(System.in);
        user.getPartyPokemon();
        System.out.println("Select a pokemon by entering its slot number. Enter -1 to go back.");
        int s = scan.nextInt();
        while (s > 6 || s == 0 || s <= -2){ //check for empty slots  || user.party[s - 1].getName().equalsIgnoreCase("Empty")
            System.out.println("Please enter a valid slot!");
            s = scan.nextInt();
        }
        if (s == -1){
            playerPhase(user, wild, option,pokedex);
        }
        optionPokemon(s,user,wild,option,pokedex);
    }

    public void optionPokemon(int s, Player user, Pokemon wild, Options option, Pokedex pokedex){
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do with " + user.party[s - 1].getName() + " ?");
        System.out.println("1. Switch\n2.Summary\n3.Check Moves\n-1. Go Back");
        int c = scan.nextInt();
        switch (c){
            case 1:
                if (s == currentID + 1){
                    System.out.println("That Pokemon is already in battle!");
                    optionPokemon(s,user,wild,option,pokedex);
                } else {
                    System.out.println("That's enough " + user.party[currentID].getName() + "!");
                    currentID = s - 1;
                    System.out.println("Go " + user.party[currentID].getName() + "!");
                    wildAttack(user,wild,option, pokedex);
                }
                break;
            case 2:
                s = s - 1;
                System.out.println("Name: " + user.party[s].getName());
                System.out.println("Level: " + user.party[s].getLevel());
                System.out.println("Attack: " + user.party[s].getAttack());
                System.out.println("Defense: " + user.party[s].getDefense());
                System.out.println("Special Attack: " + user.party[s].getSpecialAttack());
                System.out.println("Special Defense: " + user.party[s].getSpecialDefense());
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
                optionPokemon(s,user,wild,option,pokedex);
                break;
            case 3:
                displayAttack(s, user, wild, option, pokedex);
                break;
            case -1:
                selectPokemon(user,wild,option,pokedex);
                break;
        }
    }

    private void displayAttack(int s, Player user, Pokemon wild, Options option, Pokedex pokedex){
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a move you would like to view");
        System.out.println("1. " + user.party[currentID].att[0] + "  2. " + user.party[currentID].att[1] + "\n3. " + user.party[currentID].att[2] + "  4. " + user.party[currentID].att[3]);
        System.out.println("Enter -1 to go back");
        int attack = scan.nextInt();
        while (attack < 1 && attack > 4 && attack != -1) {
            System.out.print("Please enter an applicable number!");
            attack = scan.nextInt();
        }
        if (attack == -1){
            optionPokemon(s,user,wild,option,pokedex);
        } else {
            System.out.println(user.party[currentID].att[attack - 1] + "\nPower: " + user.party[currentID].att[attack - 1].getPower() + "\nType: " + user.party[currentID].att[attack - 1].getType());
            if (user.party[currentID].att[attack - 1].isPhysical()){
                System.out.println("Physical");
            } else {
                System.out.println("Special");
            }
            System.out.println("Enter -1 to go back");
            attack = scan.nextInt();
            while (attack != -1) {
                System.out.print("Please enter an applicable number!");
                attack = scan.nextInt();
            }
            displayAttack(s,user,wild,option,pokedex);
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
}