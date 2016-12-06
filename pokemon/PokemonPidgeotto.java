package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgeotto extends Pokemon{

    public PokemonPidgeotto(){
        name = "Pidgeotto";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 17; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        atk = (60 * 2 + iv) * lev / 100 + 5;
        def = (55 * 2 + iv) * lev / 100 + 5;
        spAtk = (50 * 2 + iv) * lev / 100 + 5;
        spDef = (50 * 2 + iv) * lev / 100 + 5;
        spd = (71 * 2 + iv) * lev / 100 + 5;
        hp = (63 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackAirSlash(), new AttackQuickAttack(), new AttackTwister(), new AttackWingAttack()};
    }

}