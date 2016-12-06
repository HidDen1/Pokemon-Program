package game;

import pokemon.Pokemon;

import java.util.Scanner;

public class Player{
    public double expTrainer, toLevelUp, toLevelUpPokemon;
    public int pokedollars, nextID, currentID, level = 1, partyAmount = 1; //party amount will need to be altered when part is full or removed from
    public String name;
    public double pokemonLevel [] = new double [1000];
    public int pokemonExp [] = new int [1000];
    public double remainingHealth [] = new double [1000];
    protected Pokemon party [] = new Pokemon [6];
    protected Pokemon storage [] = new Pokemon[1000];

    public Player(String trainerName, int typ, Inventory inventory){
        name = trainerName;
        Pokemon beginner = null;
        beginner = beginner.beginnerPokemon(typ);
        pokemonLevel[0] = beginner.getLevel();
        pokemonExp [0] = 0;
        remainingHealth [0] = beginner.getHealthPoints();
        party [0] = beginner;
        storage [0] = beginner;
        nextID = 0;
        party [1] = null;
        party [2] = null;
        party [3] = null;
        party [4] = null;
        party [5] = null;
        expToLevelUp();
        expToLevelUpPokemon();
    }

    public void getAllStats(){
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

    public void gainExperience(){
        expTrainer = expTrainer + 50;
        if (expTrainer >= toLevelUp){
            levelUpTrainer();
        }
    }

    public void gainPokedollars(){
        pokedollars += 100;
    }

    private int levelUpTrainer(){ //levels up trainer
        level++;
        expTrainer = expTrainer - toLevelUp;
        expToLevelUp();
        System.out.println("Congratulations, you are now trainer level " + level);

        return level;
    }

    private void expToLevelUp(){ //calculates exp needed to level up for trainer
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

    public void gainExperiencePokemon(){ //needs to be updated for all pokemon, actual exp calculation needed
        if (pokemonLevel[0] < 100){
            pokemonExp[0] = pokemonExp[0] + 100;
            if (pokemonExp[0] >= toLevelUpPokemon){
                pokemonLevel[0]++;
                party[0].setLevel(pokemonLevel[0]);
                party[0].setAttack((100 * (party[0].getAttack() - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5);
                party[0].setDefense((100 * (party[0].getDefense() - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5);
                party[0].setSpecialAttack((100 * (party[0].getSpecialAttack() - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5);
                party[0].setSpecialDefense((100 * (party[0].getSpecialDefense() - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5);
                party[0].setSpeed((100 * (party[0].getSpeed() - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5);
                party[0].setHP((100 * (party[0].getHealthPoints() - 10) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 10);
                remainingHealth[0] = party[0].getHealthPoints();
                expToLevelUpPokemon();
                System.out.println(party[0].getName() + " leveled up to level " + pokemonLevel[0]);
                pokemonExp[0] = 0;
            }
        }
    }

    public void expToLevelUpPokemon(){ //caluclates exp needed to level up beginner pokemon, needs updated for all pokemon, actual exp calculation needed
        toLevelUpPokemon = Math.pow(pokemonLevel[0] * 2 , 2);
    }

    public void getPartyPokemon(){ //will have an option to check their stats
        int a = 0;
        while (a <= partyAmount - 1){
            a++;
            System.out.println(a + ". " + party[a - 1].getName());
        }
    }


    public void viewStats(Player user){
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
            System.out.println("HP: " + remainingHealth[c] + "/" + party[c].getHealthPoints());
            System.out.println("EXP: " + pokemonExp[c] + " / " + toLevelUpPokemon);
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

    public int getNextID(){
        nextID++;
        return nextID;
    } //will be used to assign IDs to each pokemon.Pokemon once caught

    public Pokemon getPokemonBattling(){
        return(party[0]);
    } //will be used to get the pokemon battling

    public double healthCheck(){
        double healthGain = 20;
        if (this.remainingHealth[0] > party[0].getHealthPoints()){ //causing a crash
            healthGain = party[0].getHealthPoints() - (this.remainingHealth[0] - 20);
            this.remainingHealth[0] = party[0].getHealthPoints();
        }
        return healthGain;
    }
    public double healthCheck2(){
        double healthGain = 50;
        if (this.remainingHealth[0] > party[0].getHealthPoints()){ //causing a crash
            healthGain = party[0].getHealthPoints() - (this.remainingHealth[0] - 50);
            this.remainingHealth[0] = party[0].getHealthPoints();
        }
        return healthGain;
    }
    public double healthCheck3(){
        double healthGain = 200;
        if (this.remainingHealth[0] > party[0].getHealthPoints()){ //causing a crash
            healthGain = party[0].getHealthPoints() - (this.remainingHealth[0] - 200);
            this.remainingHealth[0] = party[0].getHealthPoints();
        }
        return healthGain;
    }

    public void healAll(){
        this.remainingHealth[0] = party[0].getHealthPoints();
    }

    public int getTrainerLevel(){
        return(level);
    }
    public Pokemon getPokemon(){
        return(party[0]);
    }
}
