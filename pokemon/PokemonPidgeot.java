package pokemon;

import game.Player;

public class PokemonPidgeot extends Pokemon{

    public PokemonPidgeot(){
        name = "Pidgeot";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 17; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Normal/Flying";
        atk = (80 * 2 + iv) * lev / 100 + 5;
        def = (75 * 2 + iv) * lev / 100 + 5;
        spAtk = (70 * 2 + iv) * lev / 100 + 5;
        spDef = (70 * 2 + iv) * lev / 100 + 5;
        spd = (101 * 2 + iv) * lev / 100 + 5;
        hp = (83 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Air Slash", "Hurricane", "Brave Bird", "Steel Wing"};
        attPower = new int[]{75, 110, 120, 70};
        attType1 = new String[]{"Flying", "Flying", "Flying", "Steel"};
        attType2 = new String[]{"Special", "Special", "Physical", "Physical"};
    }

}