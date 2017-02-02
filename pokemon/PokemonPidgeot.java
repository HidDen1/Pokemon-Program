package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgeot extends Pokemon{

    public PokemonPidgeot(int lev){
        name = "Pidgeot";
        //id = 1;
        pokeNum = 17;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        atkIV = ivGenerator();
        defIV = ivGenerator();
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        atkEVG = 0;
        defEVG = 0;
        spAtkEVG = 0;
        spDefEVG = 0;
        spdEVG = 4;

        hpEV = 0;
        atkEV = 0;
        defEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseAtk = 80;
        baseDef = 75;
        baseSpAtk = 70;
        baseSpDef = 70;
        baseSpd = 101;
        baseHp = 83;

        atk = ((baseAtk * 2 + atkIV + atkEV / 4) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((baseDef * 2 + defIV + defEV / 4) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackAirSlash(), new AttackHurricane(), new AttackBraveBird(), new AttackSteelWing()};
    }

}