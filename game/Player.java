package game;

import pokemon.Pokemon;
import pokemon.PokemonEmpty;
import pokemon.Stats;

public class Player extends Stats {
    public double expTrainer, toLevelUp, toLevelUpPokemon;
    public int pokedollars, nextID, currentID;
    public String name;
    public double pokemonLevel [] = new double [1000];
    public int pokemonExp [] = new int [1000];
    public double remainingHealth [] = new double [1000];

    public Player(String trainerName, int typ, Inventory inventory){
        name = trainerName;
        Pokemon beginner = new PokemonEmpty();
        beginner = beginner.beginnerPokemon(typ);
        pokemonLevel[0] = beginner.getLevel();
        pokemonExp [0] = 0;
        remainingHealth [0] = beginner.getHealthPoints();
        party [0] = beginner;
        storage [0] = beginner;
        nextID = 0;
        Pokemon empty = new PokemonEmpty();
        party [1] = empty;
        party [2] = empty;
        party [3] = empty;
        party [4] = empty;
        party [5] = empty;
        expToLevelUp();
        expToLevelUpPokemon();
    }

    public void getAllStats(){
        System.out.println("Name: " + name);
        System.out.println("Trainer Level: " + this.getTrainerLevel());
        System.out.println("To next level: " + this.getExp() + "/" + this.getToLevelUp());
        System.out.println("Pokedollars: $" + this.getPokedollars());
        //temp stats for beginner, will be an option to check in party
        System.out.println("Name: " + party[0].getName());
        System.out.println("Level: " + party[0].getLevel());
        System.out.println("Attack: " + party[0].getAttack());
        System.out.println("Deffense: " + party[0].getDeffense());
        System.out.println("Special Attack: " + party[0].getSpecialAttack());
        System.out.println("Special Deffence: " + party[0].getSpecialDeffense());
        System.out.println("Speed: " + party[0].getSpeed());
        System.out.println("HP: " + remainingHealth[0] + "/" + party[0].getHealthPoints());
        System.out.println("EXP: " + pokemonExp[0] + " / " + toLevelUpPokemon);
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
                party[0].lev = pokemonLevel[0];
                party[0].atk =  (100 * (party[0].atk - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5;
                party[0].def =  (100 * (party[0].def - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5;
                party[0].spAtk =  (100 * (party[0].spAtk - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5;
                party[0].spDef =  (100 * (party[0].spDef - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5;
                party[0].spd =  (100 * (party[0].spd - 5) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 5;
                party[0].hp =  (100 * (party[0].hp - 10) / (pokemonLevel[0] - 1)) * pokemonLevel [0] / 100 + 10;
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
        System.out.println("1. " + party [0].getName());
        System.out.println("2. " + party [1].getName());
        System.out.println("3. " + party [2].getName());
        System.out.println("4. " + party [3].getName());
        System.out.println("5. " + party [4].getName());
        System.out.println("6. " + party [5].getName());
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
}
