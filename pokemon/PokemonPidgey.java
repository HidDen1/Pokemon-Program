package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgey extends Pokemon{

    public PokemonPidgey(int lev){
        name = "Pidgey";
        //id = 1;
        pokeNum = 16;
        evolution = new PokemonPidgeotto(lev);
        levEv = 18;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        captureRate = 255;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(45, 0, 0, temp, ((90 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(40, 0, 0, temp, ((80 + temp) * lev / 100 + 5) * nat.getDefBonus());
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spAtkEVG = 0;
        spDefEVG = 0;
        spdEVG = 2;

        hpEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpAtk = 35;
        baseSpDef = 35;
        baseSpd = 56;
        baseHp = 40;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackGust(), new AttackQuickAttack(), new AttackTwister(), new AttackWingAttack()};
    }

}