package pokemon;

import attack.Attack;
import game.Player;
import type.Type;

public abstract class Pokemon{
    protected String name, itemName;
    protected double atk, def, spAtk, spDef, spd, hpMax, hp, lev, expMax, exp, levEv;
    protected int iv, id, healthRestore;
    public Attack att [] = new Attack[4];
    public Type[] type;
    protected Pokemon evolution;

    public String getName(){
        return(name);
    }

    public double getHealth(){
        return hp;
    }

    public void setHealth(double hp){
        this.hp = hp;
    }

    public double getExperience(){ return exp; }

    public void setExperience(double exp){ this.exp = exp; }

    public double getLevEv(){
        return levEv;
    }

    public Pokemon getEvolution(){
        return evolution;
    }

    public double getAttack(){
        return(atk);
    }

    public void setAttack(double a){
        atk = a;
    }

    public double getDefense(){
        return(def);
    }

    public void setDefense(double d /*hehe double D*/){
        def = d;
    }

    public double getSpecialAttack(){
        return(spAtk);
    }

    public void setSpecialAttack(double a){
        spAtk = a;
    }

    public double getSpecialDefense(){
        return(spDef);
    }

    public void setSpecialDefense(double d /*hehe double D*/){
        spDef = d;
    }

    public double getSpeed(){
        return(spd);
    }

    public void setSpeed(double s){
        spd = s;
    }

    public double getHealthPoints(){
        return(hpMax);
    }

    public void setHP(double hp){
        this.hpMax = hp;
    }

    public double getLevel(){
        return(lev);
    }

    public void setLevel(double l){
        lev = l;
    }

    public int getIV(){
        return(iv);
    }



    public Type[] getElementType(){
        return(type);
    }

    public int getID(){
        return (id);
    }


    static Pokemon[] getRarityLev1(int lev){
        return new Pokemon[]{new PokemonBulbasaur(lev), new PokemonSquirtle(lev), new PokemonCharmander(lev), new PokemonCaterpie(lev), new PokemonWeedle(lev), new PokemonPidgey(lev)};
    }

    static Pokemon[] getRarityLev2(int lev){
        return new Pokemon[]{new PokemonIvysaur(lev), new PokemonWartortle(lev), new PokemonCharmeleon(lev), new PokemonMetapod(lev), new PokemonKakuna(lev), new PokemonPidgeotto(lev)};
    }

    static Pokemon[] getRarityLev3(int lev){
        return new Pokemon[]{new PokemonVenusaur(lev), new PokemonBlastoise(lev), new PokemonCharizard(lev), new PokemonButterfree(lev), new PokemonBeedrill(lev), new PokemonPidgeot(lev)};
    }

    static Pokemon[] getStarters(int lev){
        return new Pokemon[]{new PokemonBulbasaur(lev), new PokemonSquirtle(lev), new PokemonCharmander(lev)};
    }


    static public Pokemon wildPokemon(Player user){
        int id = idGenerator();
        double chance;
        chance = getChance();
        Pokemon p;
        int lev = levelGenerator(user);

        if (chance <= 60){
            p = getRarityLev1(lev)[id];
        } else if (chance <= 89){
            p = getRarityLev2(lev)[id];
        } else {
            p = getRarityLev3(lev)[id];
        }
        assert p != null;
            p.changeLevel(levelGenerator(user));
        return p;
    }

    static public Pokemon beginnerPokemon(int typ){
        int lev = 5;
        Pokemon p = getStarters(lev)[typ];
        p.changeLevel(5);
        return p;
    }

    protected static int levelGenerator(Player user){
        double l;
        int e;

        //l = (1 + Math.random() * (100 - 1));
        //while (l > user.pokemonLevel[0] + 5){
           //l = (1 + Math.random() * (100 - 1));
        //}

        //e = (int) Math.round(l);
        e = 1; //for testing

        return e;
    }

    protected int ivGenerator(){
        double i;
        int v;

        i = Math.random() * 31;
        v = (int) Math.round(i);

        return v;
    }

    private static double getChance(){
        double chance;
        chance = Math.random() * 100;
        chance = Math.round(chance);

        return chance;
    }

    private static int idGenerator(){
        double a;
        int b;

        a = Math.random() * (5);
        b = (int) Math.round(a);

        return b;
    }

    void changeLevel(int l){
        lev = l;
    }
}

//similar to enemy class in the quest and indivs for stats