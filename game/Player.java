package game;

import pokemon.Pokemon;

import java.util.Scanner;

public class Player{
    private double expTrainer, toLevelUp, toLevelUpPokemon;
    private int pokedollars, level = 1;
    public String name;
    Pokemon party [] = new Pokemon [6];
    Pokemon storage [] = new Pokemon[120];
    Inventory inventory = new Inventory();

    public Inventory getInventory(){
        return inventory;
    }

    public Pokemon[] getParty(){
        return party;
    }

    public Player(String trainerName, int typ){
        name = trainerName;
        Pokemon beginner = Pokemon.beginnerPokemon(typ);
        party [0] = beginner;
        party[0].setExperience(0);
        party[0].setHealth(beginner.getHealthPoints());
        storage [0] = beginner;
        party [1] = null;
        party [2] = null;
        party [3] = null;
        party [4] = null;
        party [5] = null;
        expToLevelUp();
        expToLevelUpPokemon(0);
        //PCSystem PC = new PCSystem();
    }

    void getAllStats(){
        System.out.println("Name: " + name);
        System.out.println("Trainer Level: " + this.getTrainerLevel());
        System.out.println("To next level: " + this.getExp() + "/" + this.getToLevelUp());
        System.out.println("Pokedollars: $" + this.getPokedollars());
        //temp stats for beginner, will be an option to check in party
        //System.out.println("Name: " + party[0].getName());
        //System.out.println("Level: " + party[0].getLevel());
        //System.out.println("Attack: " + party[0].getAttack());
        //System.out.println("Deffense: " + party[0].getDeffense());
        //System.out.println("Special Attack: " + party[0].getSpecialAttack());
        //System.out.println("Special Deffence: " + party[0].getSpecialDeffense());
        //System.out.println("Speed: " + party[0].getSpeed());
        //System.out.println("HP: " + remainingHealth[0] + "/" + party[0].getHealthPoints());
        //System.out.println("EXP: " + pokemonExp[0] + " / " + toLevelUpPokemon);
    }

    public String getName(){
        return name;
    }

    void gainExperience(){
        expTrainer = expTrainer + 50;
        if (expTrainer >= toLevelUp){
            levelUpTrainer();
        }
    }

    void gainPokedollars(){
        pokedollars += 100;
    }

    private int levelUpTrainer(){ //levels up trainer
        level++;
        expTrainer = expTrainer - toLevelUp;
        expToLevelUp();
        System.out.println("Congratulations, you are now trainer level " + level);

        return level;
    }

    private void expToLevelUp(){ //calculates expMax needed to level up for trainer
        toLevelUp = level * 1000;
    }

    private double getExp(){
        return expTrainer;
    }

    public int getPokedollars(){
        return pokedollars;
    }

    public void spendPokedollars(int a){
        pokedollars = pokedollars - a;
    }

    private double getToLevelUp(){
        return toLevelUp;
    }

    void gainExperiencePokemon(int currentID){ //needs actual expMax calculations, needs changed in the event of multiple level ups at once
        if (party[currentID].getLevel() < 100){
            party[currentID].setExperience(party[currentID].getExperience() + 100);
            if (party[currentID].getExperience() >= toLevelUpPokemon){
                party[currentID].setLevel(party[currentID].getLevel() + 1);
                party[currentID].setAttack((100 * (party[currentID].getAttack() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setDefense((100 * (party[currentID].getDefense() - 5) / (party[currentID].getLevel() - 1)) * party [currentID].getLevel() / 100 + 5);
                party[currentID].setSpecialAttack((100 * (party[currentID].getSpecialAttack() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setSpecialDefense((100 * (party[currentID].getSpecialDefense() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setSpeed((100 * (party[currentID].getSpeed() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setHP((100 * (party[currentID].getHealthPoints() - 10) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 10);
                party[currentID].setHealth(party[currentID].getHealthPoints());
                expToLevelUpPokemon(currentID);
                System.out.println(party[currentID].getName() + " leveled up to level " + party[currentID].getLevel());
                party[currentID].setExperience(0);
            }
            if (party[currentID].getLevEv() == party[currentID].getLevel()){
                System.out.print("Congratulations, your " + party[0].getName());
                party[currentID] = party[0].getEvolution();
                party[currentID].setLevel(party[currentID].getLevel());
                party[currentID].setAttack((100 * (party[currentID].getAttack() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setDefense((100 * (party[currentID].getDefense() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setSpecialAttack((100 * (party[currentID].getSpecialAttack() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setSpecialDefense((100 * (party[currentID].getSpecialDefense() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setSpeed((100 * (party[currentID].getSpeed() - 5) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 5);
                party[currentID].setHP((100 * (party[currentID].getHealthPoints() - 10) / (party[currentID].getLevel() - 1)) * party[currentID].getLevel() / 100 + 10);
                party[currentID].setHealth(party[currentID].getHealthPoints());
                System.out.println(" has evolved into a " + party[currentID].getName()); //ivs need to be held over
            }
        }
    }

    private void expToLevelUpPokemon(int currentID){ //caluclates expMax needed to level up beginner pokemon, needs updated for all pokemon, actual expMax calculation needed
        toLevelUpPokemon = Math.pow(party[currentID].getLevel() * 2 , 2);
    }

    void getPartyPokemon(){ //will have an option to check their stats
        int a = 0;
        while (a <= party.length - 1){
            a++;
            System.out.println(a + ". " + party[a - 1].getName());
        }
    }


    void viewStats(Player user){
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a pokemon that you want to view. Enter -1 to go back.");
        int c = scan.nextInt();
        while (c > 6 || c == 0 || c < -1){
            System.out.println("Please enter a valid slot!");
            c = scan.nextInt();
        }
        if (c != -1){
            c = c - 1;
            System.out.println("Name: " + party[c].getName());
            System.out.println("Level: " + party[c].getLevel());
            System.out.println("Attack: " + party[c].getAttack());
            System.out.println("Defense: " + party[c].getDefense());
            System.out.println("Special Attack: " + party[c].getSpecialAttack());
            System.out.println("Special Deffence: " + party[c].getSpecialDefense());
            System.out.println("Speed: " + party[c].getSpeed());
            System.out.println("HP: " + party[c].getHealth() + "/" + party[c].getHealthPoints());
            System.out.println("EXP: " + party[c].getExperience() + " / " + toLevelUpPokemon);
            System.out.println("Enter -1 to go back.");
            int k = scan.nextInt();
            while (k != -1){
                System.out.println("Please enter -1 to go back!");
                k = scan.nextInt();
            }
            user.getPartyPokemon();
            viewStats(user);
        }
    }

    public Pokemon getPokemonBattling(){
        return(party[0]);
    } //will be used to get the pokemon battling

    public double healthCheck(double healthGain){
        if (party[0].getHealth() > party[0].getHealthPoints()){ //causing a crash
            healthGain = party[0].getHealthPoints() - (party[0].getHealth() - healthGain);
            party[0].setHealth(party[0].getHealthPoints());
        }
        return healthGain;
    }

    void healAll(){
        party[0].setHealth(party[0].getHealthPoints());
    }

    private int getTrainerLevel(){
        return(level);
    }
    public Pokemon getPokemon(){
        return(party[0]);
    }
}
