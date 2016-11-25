package pokemon;

import game.Player;
import type.Type;


//pokemon.Pokemon should be an object with those 25 attributes.  You should have an arraylist full of them.
public abstract class Pokemon{
    protected String name, itemName;
    protected double atk, def, spAtk, spDef, spd, hp, lev, exp, ballBonus;
    protected int iv, id, healthRestore, itemID;
    public String att [] = new String[4];
    public String attType1 [] = new String [4];
    public String attType2 [] = new String [4];
    public Type[] type;
    public int attPower [] = new int[4];

    public String getName(){
        return(name);
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
        return(hp);
    }

    public void setHP(double hp){
        this.hp = hp;
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



    public int getItemID(){
        return(itemID);
    }

    static Pokemon[] getRarityLev1(){
        return new Pokemon[]{new PokemonBulbasaur(), new PokemonSquirtle(), new PokemonCharmander(), new PokemonCaterpie(), new PokemonWeedle(), new PokemonPidgey()};
    }

    static Pokemon[] getRarityLev2(){
        return new Pokemon[]{new PokemonIvysaur(), new PokemonWartortle(), new PokemonCharmeleon(), new PokemonMetapod(), new PokemonKakuna(), new PokemonPidgeotto()};
    }

    static Pokemon[] getRarityLev3(){
        return new Pokemon[]{new PokemonVenusaur(), new PokemonBlastoise(), new PokemonCharizard(), new PokemonButterfree(), new PokemonBeedrill(), new PokemonPidgeot()};
    }

    static Pokemon[] getStarters(){
        return new Pokemon[]{new PokemonBulbasaur(), new PokemonSquirtle(), new PokemonCharmander()};
    }


    static public Pokemon wildPokemon(Player user){
        int id = idGenerator();
        double chance;
        chance = getChance();
        Pokemon p = null;

        if (chance <= 70){ //put into an array by rarity later
            p = getRarityLev1()[id];
        } else if (chance <= 90){
            p = getRarityLev2()[id];
        } else if (chance <= 100) {
            p = getRarityLev3()[id];
        }
        assert p != null;
            p.changeLevel(levelGenerator(user));
        return p;
    }

    static public Pokemon beginnerPokemon(int typ){
        Pokemon p = getStarters()[typ];
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

        a = 1 + Math.random() * (6 - 1);
        b = (int) Math.round(a);

        return b;
    }

    void changeLevel(int l){
        lev = l;
    }
}

//similar to enemy class in the quest and indivs for stats