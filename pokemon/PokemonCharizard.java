package pokemon;

import game.Player;

public class PokemonCharizard extends Pokemon{

    public PokemonCharizard(Player user){
        name = "Charizard";
        lev = levelGenerator(user);
        iv = 31;
        //id = 2;
        //pokeNum = 6;
        exp = Math.pow(lev * 10 , 2);
        type = "Fire / Flying";
        atk = (84 * 2 + iv) * lev / 100 + 5;
        def = (78 * 2 + iv) * lev / 100 + 5;
        spAtk = (109 * 2 + iv) * lev / 100 + 5;
        spDef = (85 * 2 + iv) * lev / 100 + 5;
        spd = (100 * 2 + iv) * lev / 100 + 5;
        hp = (78 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Flare Blitz", "Fire Blast", "Heat Wave", "Flamethrower"};
        attPower = new int[]{120, 120, 90 ,90};
        attType1 = new String[]{"Fire", "Fire", "Fire", "Fire"};
        attType2 = new String[]{"Physical", "Special", "Special", "Special"};
    }

}