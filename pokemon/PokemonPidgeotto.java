package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgeotto extends Pokemon{

    public PokemonPidgeotto(int lev){
        name = "Pidgeotto";
        //id = 1;
        pokeNum = 17;
        evolution = new PokemonPidgeot(lev);
        levEv = 36;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        captureRate = 120;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(60, 0, 0, temp, ((120 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(55, 0, 0, temp, ((110 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(50, 0, 0, temp, ((100 + temp) * lev / 100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(50, 0, 0, temp, ((100 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 3;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 71;
        baseHp = 63;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackAirSlash(), new AttackQuickAttack(), new AttackTwister(), new AttackWingAttack()};
    }

}