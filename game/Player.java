package game;

import pokemon.Pokemon;
import pokemon.PokemonEmpty;

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
        Pokemon beginner = Pokemon.beginnerPokemon(typ - 1);
        party [0] = beginner;
        party[0].setExperience(0);
        party[0].setHealth(beginner.getHealthPoints());
        storage [0] = beginner;
        Pokemon empty = Pokemon.emptySlot();
        party [1] = empty;
        party [2] = empty;
        party [3] = empty;
        party [4] = empty;
        party [5] = empty;
        expToLevelUp();
        expToLevelUpPokemon(0);
    }

    void getAllStats(){
        System.out.println("Name: " + name);
        System.out.println("Trainer Level: " + this.getTrainerLevel());
        System.out.println("To next level: " + this.getExp() + "/" + this.getToLevelUp());
        System.out.println("Pokedollars: $" + this.getPokedollars());
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

    private int levelUpTrainer(){
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

    public void gainEVs(int currentID, double atk, double def, double spAtk, double spDef, double spd, double hp){
        if (party[currentID].getTotalEV() < 512 && party[currentID].getAtkEV() < 252){
            party[currentID].setAtkEv(party[currentID].getAtkEV() + atk);
            party[currentID].setTotalEv(party[currentID].getTotalEV() + atk);
            if (party[currentID].getTotalEV() > 512){
                atk = party[currentID].getTotalEV() - 512;
                party[currentID].setTotalEv(512);
                party[currentID].setAtkEv(party[currentID].getAtkEV() - atk);
            }
            if (party[currentID].getAtkEV() > 252){
                atk = party[currentID].getAtkEV() - 252;
                party[currentID].setAtkEv(252);
                party[currentID].setTotalEv(party[currentID].getTotalEV() - atk);
            }
        }
        if (party[currentID].getTotalEV() < 512 && party[currentID].getDefEV() < 252){
            party[currentID].setDefEv(party[currentID].getDefEV() + def);
            party[currentID].setTotalEv(party[currentID].getTotalEV() + def);
            if (party[currentID].getTotalEV() > 512){
                def = party[currentID].getTotalEV() - 512;
                party[currentID].setTotalEv(512);
                party[currentID].setDefEv(party[currentID].getDefEV() - def);
            }
            if (party[currentID].getDefEV() > 252){
                def = party[currentID].getDefEV() - 252;
                party[currentID].setDefEv(252);
                party[currentID].setTotalEv(party[currentID].getTotalEV() - def);
            }
        }
        if (party[currentID].getTotalEV() < 512 && party[currentID].getSpAtkEV() < 252){
            party[currentID].setSpAtkEv(party[currentID].getSpAtkEV() + spAtk);
            party[currentID].setTotalEv(party[currentID].getTotalEV() + spAtk);
            if (party[currentID].getTotalEV() > 512){
                spAtk = party[currentID].getTotalEV() - 512;
                party[currentID].setTotalEv(512);
                party[currentID].setSpAtkEv(party[currentID].getSpAtkEV() - spAtk);
            }
            if (party[currentID].getSpAtkEV() > 252){
                spAtk = party[currentID].getSpAtkEV() - 252;
                party[currentID].setSpAtkEv(252);
                party[currentID].setTotalEv(party[currentID].getTotalEV() - spAtk);
            }
        }
        if (party[currentID].getTotalEV() < 512 && party[currentID].getSpDefEV() < 252){
            party[currentID].setSpDefEv(party[currentID].getSpDefEV() + spDef);
            party[currentID].setTotalEv(party[currentID].getTotalEV() + spDef);
            if (party[currentID].getTotalEV() > 512){
                spDef = party[currentID].getTotalEV() - 512;
                party[currentID].setTotalEv(512);
                party[currentID].setSpDefEv(party[currentID].getSpDefEV() - spDef);
            }
            if (party[currentID].getSpDefEV() > 252){
                spDef = party[currentID].getSpDefEV() - 252;
                party[currentID].setSpDefEv(252);
                party[currentID].setTotalEv(party[currentID].getTotalEV() - spDef);
            }
        }
        if (party[currentID].getTotalEV() < 512 && party[currentID].getSpdEV() < 252){
            party[currentID].setSpdEv(party[currentID].getSpdEV() + spd);
            party[currentID].setTotalEv(party[currentID].getTotalEV() + spd);
            if (party[currentID].getTotalEV() > 512){
                spd = party[currentID].getTotalEV() - 512;
                party[currentID].setTotalEv(512);
                party[currentID].setSpdEv(party[currentID].getSpdEV() - spd);
            }
            if (party[currentID].getSpdEV() > 252){
                spd = party[currentID].getSpdEV() - 252;
                party[currentID].setSpdEv(252);
                party[currentID].setTotalEv(party[currentID].getTotalEV() - spd);
            }
        }
        if (party[currentID].getTotalEV() < 512 && party[currentID].getHpEV() < 252){
            party[currentID].setHpEv(party[currentID].getHpEV() + hp);
            party[currentID].setTotalEv(party[currentID].getTotalEV() + hp);
            if (party[currentID].getTotalEV() > 512){
                hp = party[currentID].getTotalEV() - 512;
                party[currentID].setTotalEv(512);
                party[currentID].setHpEv(party[currentID].getHpEV() - hp);
            }
            if (party[currentID].getHpEV() > 252){
                hp = party[currentID].getHpEV() - 252;
                party[currentID].setHpEv(252);
                party[currentID].setTotalEv(party[currentID].getTotalEV() - hp);
            }
        }

    }

    public void gainExperiencePokemon(int currentID){ //needs actual expMax calculations, needs changed in the event of multiple level ups at once, wont happen now cause set exp
        if (party[currentID].getLevel() < 100){
            party[currentID].setExperience(party[currentID].getExperience() + 100);
            if (party[currentID].getExperience() >= toLevelUpPokemon){
                party[currentID].setLevel(party[currentID].getLevel() + 1);
                party[currentID].setAttack(((party[currentID].getBaseAtk() * 2 + party[currentID].getAtkIV() + party[currentID].getAtkEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getAtkBonus());
                party[currentID].setDefense(((party[currentID].getBaseDef() * 2 + party[currentID].getDefIV() + party[currentID].getDefEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getDefBonus());
                party[currentID].setSpecialAttack(((party[currentID].getBaseSpAtk() * 2 + party[currentID].getSpAtkIV() + party[currentID].getSpAtkEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getSpAtkBonus());
                party[currentID].setSpecialDefense(((party[currentID].getBaseSpDef() * 2 + party[currentID].getSpDefIV() + party[currentID].getSpDefEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getSpDefBonus());
                party[currentID].setSpeed(((party[currentID].getBaseSpd() * 2 + party[currentID].getSpdIV() + party[currentID].getSpdEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getSpdBonus());
                party[currentID].setHealth(((party[currentID].getBaseHp() * 2 + party[currentID].getHpIV() + party[currentID].getHpEV() / 4) * party[currentID].getLevel() / 100 + 5));
                party[currentID].setHP(party[currentID].getHealth());
                expToLevelUpPokemon(currentID);
                System.out.println(party[currentID].getName() + " leveled up to level " + party[currentID].getLevel());
                party[currentID].setExperience(0);
            }
            if (party[currentID].getLevEv() == party[currentID].getLevel()){
                System.out.print("Congratulations, your " + party[0].getName());
                Pokemon evolution = party[0].getEvolution();
                party[currentID].setName(evolution.getName());
                party[currentID].setPokeNum(evolution.getPokeNum());
                party[currentID].setEvolution(evolution.getEvolution());
                party[currentID].setLevEv(evolution.getLevEv());
                party[currentID].type = evolution.getElementType();
                party[currentID].setBaseAtk(evolution.getBaseAtk());
                party[currentID].setBaseDef(evolution.getBaseDef());
                party[currentID].setBaseSpAtk(evolution.getBaseSpAtk());
                party[currentID].setBaseSpDef(evolution.getBaseSpDef());
                party[currentID].setBaseSpd(evolution.getBaseSpd());
                party[currentID].setBaseHp(evolution.getBaseHp());
                party[currentID].setLevel(party[currentID].getLevel() + 1);
                party[currentID].setAttack(((party[currentID].getBaseAtk() * 2 + party[currentID].getAtkIV() + party[currentID].getAtkEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getAtkBonus());
                party[currentID].setDefense(((party[currentID].getBaseDef() * 2 + party[currentID].getDefIV() + party[currentID].getDefEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getDefBonus());
                party[currentID].setSpecialAttack(((party[currentID].getBaseSpAtk() * 2 + party[currentID].getSpAtkIV() + party[currentID].getSpAtkEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getSpAtkBonus());
                party[currentID].setSpecialDefense(((party[currentID].getBaseSpDef() * 2 + party[currentID].getSpDefIV() + party[currentID].getSpDefEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getSpDefBonus());
                party[currentID].setSpeed(((party[currentID].getBaseSpd() * 2 + party[currentID].getSpdIV() + party[currentID].getSpdEV() / 4) * party[currentID].getLevel() / 100 + 5) * party[currentID].nat.getSpdBonus());
                party[currentID].setHealth(((party[currentID].getBaseHp() * 2 + party[currentID].getHpIV() + party[currentID].getHpEV() / 4) * party[currentID].getLevel() / 100 + 5));
                party[currentID].setHP(party[currentID].getHealth());
                System.out.println(" has evolved into a " + party[currentID].getName());
            }
        }
    }

    private void expToLevelUpPokemon(int currentID){ //caluclates expMax needed to level up beginner pokemon, needs updated for all pokemon, actual expMax calculation needed
        toLevelUpPokemon = Math.pow(party[currentID].getLevel() * 2 , 2);
    }

    void getPartyPokemon(){ //will have an option to check their stats
        //int a = 0;
        for (int i = 1; i <= 6; i++){
            System.out.println(i + ". " + party[i - 1].getName());
        }
        //while (a <= party.length - 1){
            //a++;

        //}
    }


    void viewStats(Player user){
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a pokemon that you want to view. Enter -1 to go back.");
        int c = scan.nextInt();

        if (c != -1){
            if (party[c - 1].getName().equalsIgnoreCase("Empty")){
                c = -1;
                System.out.println("That slot is empty!");
            }
            while (c > 6 || c == 0 || c <= -1){
                System.out.println("Please enter a valid slot!");
                c = scan.nextInt();
            }
            if (c > -1){
                c = c - 1;
                System.out.println("Name: " + party[c].getName());
                System.out.println("Level: " + party[c].getLevel());
                System.out.println(party [c].getGenderB());
                System.out.println("Nature: " + party[c].nat.getNatureName());
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
    }

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
