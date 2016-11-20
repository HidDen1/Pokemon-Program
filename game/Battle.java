package game;

import pokemon.Pokemon;
import pokemon.Stats;

import java.util.Scanner;

public class Battle extends Stats {
    public double userBattleSpeed, wildBattleSpeed, wildremainingHealth;

    public void startBattle(Player user, Options option, Inventory inventory, Battle bat) {
        int chance;
        chance = (int) getChance();
        Pokemon wild = new Pokemon();
        wild.wildPokemon(chance, user);
        System.out.println("A wild " + wild.getName() + " has appeared!");
        Pokemon battling = user.getPokemonBattling();

        wildremainingHealth = wild.getHealthPoints();
        userBattleSpeed = battling.getSpeed();
        wildBattleSpeed = wild.getSpeed();
        displayHealth(wild, battling, user);
        battle(user, wild, option, battling, inventory, bat);
    }

    private void battle(Player user, Pokemon wild, Options option, Pokemon battling, Inventory inventory, Battle bat){
        if(wildremainingHealth > 0 && user.remainingHealth [0] > 0){
            if (wildBattleSpeed > userBattleSpeed){
                wildAttackPhase(user, wild, option, battling, inventory, bat);

            } else if (userBattleSpeed >= wildBattleSpeed) {
                playerAttackPhase(user, wild, option, battling, inventory, bat);
            }
        } else if (wildremainingHealth <= 0){ //this works
            wildLose(wild, user, option, inventory, bat);
        } else if (user.remainingHealth [0] <= 0){//needs tobe changed after you can have more than one pokemon
            System.out.println("You have been defeated!");
            System.exit(0);
        }
    }

    public void playerAttackPhase(Player user, Pokemon wild, Options option, Pokemon battling, Inventory inventory, Battle bat){
        Scanner scan = new Scanner(System.in);
        String action;
        int run;

        System.out.println("What should " + battling.getName() + " do?");
        System.out.println("1. Fight   2. Bag");
        System.out.println("3. pokemon.pokemon 4. Run");
        action = scan.nextLine();

        if (action.equalsIgnoreCase("1")){
            System.out.println("Select a move by entering the corresponding number. Enter -1 to go back"); //got this far
            wildremainingHealth = actionFightUser(user, wild, option, battling, inventory, bat);
            wildremainingHealth = Math.round(wildremainingHealth);
            if (wildremainingHealth < 0){
                wildremainingHealth = 0;
            }
            displayHealth(wild, battling, user);
            if (wildremainingHealth <= 0){ //this works
                wildLose(wild, user, option, inventory, bat);
            } else {
                wildAttackPhase(user, wild, option, battling, inventory, bat);
            }
        } else if (action.equalsIgnoreCase("2")){
            inventory.useItem(user, bat, wild, option, battling, inventory);
        } else if (action.equalsIgnoreCase("3")){
            user.getPartyPokemon();
            getGoBack(user, option, wild, battling, inventory, bat);
            playerAttackPhase(user, wild, option, battling, inventory, bat);
        } else if (action.equalsIgnoreCase("4")){
            run = getRunChance();
            if (run > 50){
                System.out.println("Got away safely");
                option.optionsMenu(user, option, inventory, bat);
            } else {
                System.out.println("Could not escape");
                wildAttackPhase(user, wild, option, battling, inventory, bat);
            }
        }
    }

    private void displayHealth(Pokemon wild, Pokemon battling, Player user){
        System.out.println("LV: " + wild.getLevel() + " " + wild.getName());
        System.out.println("HP: " + wildremainingHealth + "/" + wild.getHealthPoints());
        System.out.println("LV: " + battling.getLevel() + " " + battling.getName());
        System.out.println("HP: " + user.remainingHealth [0] + "/" + battling.getHealthPoints());
    }

    public void wildAttackPhase(Player user, Pokemon wild, Options option, Pokemon battling, Inventory inventory, Battle bat){
        double a = Math.random() * 3, multiplier;
        int att = (int) a;
        checkWildAttack(wild, att);

        System.out.println("The wild " + wild.getName() + " used " + wild.att[att]);
        double damage = 0;
        multiplier = getModifier();

        if (wild.attType2[att].equalsIgnoreCase("Physical")){
            damage = ((2 * wild.getLevel() + 10) / 250) * (wild.getAttack() / battling.getDeffense()) * (wild.attPower[att] + 2) * multiplier;
        } else if (wild.attType2[att].equalsIgnoreCase("Special")){
            damage = ((2 * wild.getLevel() + 10) / 250) * (wild.getSpecialAttack() / battling.getSpecialDeffense()) * (wild.attPower[att] + 2) * multiplier;
        }
        damage = Math.round(damage);
        System.out.println("It did " + damage + " damage");
        user.remainingHealth [0] = user.remainingHealth [0] - damage;
        user.remainingHealth [0] = Math.round(user.remainingHealth [0]);
        if (user.remainingHealth [0] < 0){
            user.remainingHealth [0] = 0;
        }
        displayHealth(wild, battling, user);
        if (user.remainingHealth [0] <= 0){
            System.out.println("You have been defeated!");
            System.exit(0);
        } else {
            playerAttackPhase(user, wild, option, battling, inventory, bat);
        }
    }

    public void wildLose(Pokemon wild, Player user, Options option, Inventory inventory, Battle bat){
        double chance = getRandom();
        System.out.println("The " + wild.getName() + " has fainted!");
        System.out.println("You gained 50 exp, 100 pokemon exp, and 100 pokedollars!"); //currently constant,change later to depend of the pokemon
        if (chance < 70){
            inventory.addNewItem();
        }
        user.gainExperience();
        user.gainPokedollars();
        user.gainExperiencePokemon();
        option.optionsMenu(user, option, inventory, bat);
    }

    private void checkWildAttack(Pokemon wild, int att){
        double a;
        while (wild.att[att].equals("-----")) {
            a = Math.random() * 3;
            att = (int) a;
        }
    }

    private double actionFightUser(Player user, Pokemon wild, Options option, Pokemon battling, Inventory inventory, Battle bat){
        Scanner scan = new Scanner(System.in);
        double damage;

        System.out.println("1. " + battling.att[0] + "  2. " + battling.att[1]);
        System.out.println("3. " + battling.att[2] + "  4. " + battling.att[3]);
        int attack = scan.nextInt();
        if (attack == -1){
            playerAttackPhase(user, wild, option, battling, inventory, bat);
        }
        damage = damageCalculatorUser(attack, wild, battling, option, user, inventory, bat);
        damage = Math.round(damage);
        System.out.println("It did " + damage + " damage");
        wildremainingHealth = wildremainingHealth - damage;

        return wildremainingHealth;
    }

    private int damageCalculatorUser(int attack, Pokemon wild, Pokemon battling, Options option, Player user, Inventory inventory, Battle bat){
        int att = attack - 1, d = 0;
        double damage, multiplier;

        multiplier = getModifier();

        if (battling.att[att].equalsIgnoreCase("-----")) {
            System.out.println("Invalid Move");
            actionFightUser(user, wild, option, battling, inventory, bat);
        }

        if (battling.attType2[att].equalsIgnoreCase("Physical")){
            damage = (2 * battling.getLevel() + 10) / 250 * (battling.getAttack() / wild.getDeffense()) * (battling.attPower[att] + 2) * multiplier;
            d = (int) damage;
        } else if (battling.attType2[att].equalsIgnoreCase("Special")){
            damage = ((2 * battling.getLevel() + 10) / 250) * (battling.getSpecialAttack() / wild.getSpecialDeffense()) * (battling.attPower[att] + 2) * multiplier;
            d = (int) damage;
        }

        return d;
    }

    private double getChance(){
        double chance;
        chance = Math.random() * 100;
        chance = Math.round(chance);

        return chance;
    }

    private int getRunChance(){
        int r;
        double a;

        a = Math.random() * 100;
        r = (int) Math.round(a);

        return r;
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

    private double getCriticalMultiplier(){
        double c = Math.random() * 10;
        if (c == 10){
            c = 2;
            System.out.println("It was a Critical Hit!");
        } else {
            c = 1;
        }
        return c;
    }

    private double getRandomMultiplier(){
        double r = .85 + Math.random() * (1 - .85);
        return r;
    }

    private double getRandom(){
        double t = 1 + Math.random() * (100 - 1);
        return t;
    }

    private void getGoBack(Player user, Options option, Pokemon wild, Pokemon battling, Inventory inventory, Battle bat){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter -1 to go back");
        int one = scan.nextInt();
        if (one == -1){
            playerAttackPhase(user, wild, option, battling, inventory, bat);
        }
        while (one != -1){
            System.out.println("Invalid number entered. Please Enter -1 to go back");
            one = scan.nextInt();
            if (one == -1){
                playerAttackPhase(user, wild, option, battling, inventory, bat);
            }
        }
    }

}