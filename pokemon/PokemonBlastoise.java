package pokemon;

import type.Type;
import type.TypeWater;

public class PokemonBlastoise extends Pokemon{

    public PokemonBlastoise(){
        name = "Blastoise";
        iv = ivGenerator();
        //id = 3;
        //pokeNum = 9;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{new TypeWater()};
        atk = (83 * 2 + iv) * lev / 100 + 5;
        def = (100 * 2 + iv) * lev / 100 + 5;
        spAtk = (85 * 2 + iv) * lev / 100 + 5;
        spDef = (105 * 2 + iv) * lev / 100 + 5;
        spd = (78 * 2 + iv) * lev / 100 + 5;
        hp = (79 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Aqua Tail", "Ice Beam", "Skull Bash", "Hydro Pump"};
        attPower = new int[]{90, 90, 130, 110};
        attType1 = new String[]{"Water", "Ice", "Normal", "Water"};
        attType2 = new String[]{"Physical", "Special", "Physical", "Special"};
    }

}