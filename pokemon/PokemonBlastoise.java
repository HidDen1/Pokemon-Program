package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonBlastoise extends Pokemon{

    public PokemonBlastoise(int lev){
        name = "Blastoise";
        iv = ivGenerator();
        //id = 3;
        //pokeNum = 9;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        atk = (83 * 2 + iv) * lev / 100 + 5;
        def = (100 * 2 + iv) * lev / 100 + 5;
        spAtk = (85 * 2 + iv) * lev / 100 + 5;
        spDef = (105 * 2 + iv) * lev / 100 + 5;
        spd = (78 * 2 + iv) * lev / 100 + 5;
        hp = (79 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackAquaTail(), new AttackIceBeam(), new AttackSkullBash(), new AttackHydroPump()};
    }

}