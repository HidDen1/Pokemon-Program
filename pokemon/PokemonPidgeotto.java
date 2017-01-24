package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgeotto extends Pokemon{

    public PokemonPidgeotto(int lev){
        name = "Pidgeotto";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 17; //for the pokedex
        evolution = new PokemonPidgeot(lev);
        levEv = 36;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        atk = ((60 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((55 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((50 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((50 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((71 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (63 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackAirSlash(), new AttackQuickAttack(), new AttackTwister(), new AttackWingAttack()};
    }

}