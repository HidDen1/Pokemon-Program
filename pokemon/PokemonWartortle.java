package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonWartortle extends Pokemon{

    public PokemonWartortle(int lev){
        name = "Wartortle";
        iv = ivGenerator();
        //id = 3;
        //pokeNum = 8;
        evolution = new PokemonBlastoise(lev);
        levEv = 36;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        atk = (63 * 2 + iv) * lev / 100 + 5;
        def = (80 * 2 + iv) * lev / 100 + 5;
        spAtk = (65 * 2 + iv) * lev / 100 + 5;
        spDef = (80 * 2 + iv) * lev / 100 + 5;
        spd = (58 * 2 + iv) * lev / 100 + 5;
        hpMax = (59 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackAquaTail(), new AttackIceBeam(), new AttackBite(), new AttackBrine()};
    }

}