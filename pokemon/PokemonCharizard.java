package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;
import type.TypeFlying;

public class PokemonCharizard extends Pokemon{

    public PokemonCharizard(int lev){
        name = "Charizard";
        iv = 31;
        //id = 2;
        //pokeNum = 6;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        atk = ((84 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((78 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((109 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((85 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((100 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (78 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackFireBlitz(), new AttackFireBlast(), new AttackHeatWave(), new AttackFlamethrower()};
    }

}