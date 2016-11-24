package pokemon;

import game.Player;

public class PokemonCaterpie extends Pokemon{

    public PokemonCaterpie(){
        name = "Caterpie";
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 10; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Bug";
        atk = (30 * 2 + iv) * lev / 100 + 5;
        def = (35 * 2 + iv) * lev / 100 + 5;
        spAtk = (20 * 2 + iv) * lev / 100 + 5;
        spDef = (20 * 2 + iv) * lev / 100 + 5;
        spd = (45 * 2 + iv) * lev / 100 + 5;
        hp = (45 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Tackle", "Bug Bite", "---", "---"};
        attPower = new int[]{50, 60, 0, 0};
        attType1 = new String[]{"Normal", "Bug", "", ""};
        attType2 = new String[]{"Physical", "Physical", "", ""};
    }

}