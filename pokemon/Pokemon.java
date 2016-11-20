package pokemon;

import game.Player;

//pokemon.pokemon should be an object with those 25 attributes.  You should have an arraylist full of them.
public abstract class Pokemon extends Stats {
    @Deprecated
    public void wildPokemon(Player user){

    }

    @Deprecated
    public void beginnerPokemon(int typ){ //depends on the users choose

    }

    public void emptySlot(){
        name = "Empty";
        lev = 0;
        iv = 0;
        id = 1;
        exp = Math.pow(lev * 10 , 2);
        type = "null";
        atk = 0;
        def = 0;
        spAtk = 0;
        spDef = 0;
        spd = 0;
        hp = 0;
        att[0] = "";
        attPower[0] = 0;
        attType1 [0] = "";
        attType2 [0] = "";
        att[1] = "";
        attPower[1] = 0;
        attType1 [1] = "";
        attType2 [1] = "";
        att[2] = "";
        attPower[2] = 0;
        attType1 [2] = "";
        attType2 [2] = "";
        att[3] = "";
        attPower[3] = 0;
        attType1 [3] = "";
        attType2 [3] = "";
    }

    protected int levelGenerator(Player user){
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

    private int idGenerator(){
        double a;
        int b;

        a = 1 + Math.random() * (6 - 1);
        b = (int) Math.round(a);

        return b;
    }
}

//similar to enemy class in the quest and indivs for stats