package pokemon;

import game.Player;

public class PokemonIvysaur extends Pokemon{

    public PokemonIvysaur(){
        name = "Ivysaur";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 2;
        exp = Math.pow(lev * 10 , 2);
        type = "Grass / Posion";
        atk = (62 * 2 + iv) * lev / 100 + 5;
        def = (63 * 2 + iv) * lev / 100 + 5;
        spAtk = (80 * 2 + iv) * lev / 100 + 5;
        spDef = (80 * 2 + iv) * lev / 100 + 5;
        spd = (60 * 2 + iv) * lev / 100 + 5;
        hp = (60 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Vine Whip", "Razorleaf", "Double Edge", "Solarbeam"};
        attPower = new int[]{45, 55, 120, 120};
        attType1 = new String[]{"Grass", "Grass", "Normal", "Grass"};
        attType2 = new String[]{"Physical", "Physical", "Physical", "Special"};
    }

}