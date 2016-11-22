package pokemon;

import game.Player;

public class PokemonMetapod extends Pokemon{

    public PokemonMetapod(Player user){
        name = "Metapod";
        lev = levelGenerator(user);
        iv = ivGenerator();
        //id = 11;
        //pokeNum = 10; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Bug";
        atk = (20 * 2 + iv) * lev / 100 + 5;
        def = (55 * 2 + iv) * lev / 100 + 5;
        spAtk = (25 * 2 + iv) * lev / 100 + 5;
        spDef = (25 * 2 + iv) * lev / 100 + 5;
        spd = (30 * 2 + iv) * lev / 100 + 5;
        hp = (50 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Tackle", "Bug Bite", "---", "---"};
        attPower = new int[]{50, 60, 0, 0};
        attType1 = new String[]{"Normal", "Bug", "", ""};
        attType2 = new String[]{"Physical", "Physical", "", ""};
    }

}