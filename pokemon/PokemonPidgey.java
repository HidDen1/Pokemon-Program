package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgey extends Pokemon{

    public PokemonPidgey(int lev){
        name = "Pidgey";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 16; //for the pokedex
        evolution = new PokemonPidgeotto(lev);
        levEv = 18;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        atk = (45 * 2 + iv) * lev / 100 + 5;
        def = (40 * 2 + iv) * lev / 100 + 5;
        spAtk = (35 * 2 + iv) * lev / 100 + 5;
        spDef = (35 * 2 + iv) * lev / 100 + 5;
        spd = (56 * 2 + iv) * lev / 100 + 5;
        hpMax = (40 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackGust(), new AttackQuickAttack(), new AttackTwister(), new AttackWingAttack()};
    }

}