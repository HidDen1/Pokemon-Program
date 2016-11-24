package pokemon;

import game.Player;

public class PokemonVenusaur extends Pokemon{

    public PokemonVenusaur(){
        name = "Venusaur";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 2;
        exp = Math.pow(lev * 10 , 2);
        type = "Grass / Poison";
        atk = (82 * 2 + iv) * lev / 100 + 5;
        def = (83 * 2 + iv) * lev / 100 + 5;
        spAtk = (100 * 2 + iv) * lev / 100 + 5;
        spDef = (100 * 2 + iv) * lev / 100 + 5;
        spd = (80 * 2 + iv) * lev / 100 + 5;
        hp = (80 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Petal Dance", "Petal Blizzard", "Double Edge", "Solarbeam"};
        attPower = new int[]{120, 90, 120, 120};
        attType1 = new String[]{"Grass", "Grass", "Normal", "Grass"};
        attType2 = new String[]{"Special", "Physical", "Physical", "Special"};
    }

}