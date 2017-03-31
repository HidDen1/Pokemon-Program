package pokemon;

import attack.*;
import type.Type;
import type.TypeNormal;


public class PokemonRaticate extends Pokemon{
    public PokemonRaticate(int lev){
        name = "Raticate";
        //id = 2;
        pokeNum = 20;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT)};
        gender = setGender();
        captureRate = 127;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(81, 0, 0, temp, ((162 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(60, 0, 0, temp, ((120 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(50, 0, 0, temp, ((100 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spDefEVG = 0;
        spdEVG = 3;

        hpEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpDef = 70;
        baseSpd = 97;
        baseHp = 55;

        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackDoubleEdge(), new AttackCrunch(), new AttackAssurance(), new AttackHyperFang()};
    }
}
