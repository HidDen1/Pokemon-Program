package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonSquirtle extends Pokemon{

    public PokemonSquirtle(){
        name = "Squirtle";
        iv = ivGenerator();
        //id = 3;
        //pokeNum = 7;
        evolution = new PokemonWartortle();
        levEv = 16;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        atk = (48 * 2 + iv) * lev / 100 + 5;
        def = (65 * 2 + iv) * lev / 100 + 5;
        spAtk = (50 * 2 + iv) * lev / 100 + 5;
        spDef = (64 * 2 + iv) * lev / 100 + 5;
        spd = (43 * 2 + iv) * lev / 100 + 5;
        hp = (44 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackWaterGun(), new AttackWaterPulse(), new AttackBite(), new AttackBrine()};
    }

}