package pokemon;

import attack.*;
import type.Type;
import type.TypeElectric;

public class PokemonRaichu extends Pokemon{
    public PokemonRaichu(int lev) {
        name = "Raichu";
        //id = 2;
        pokeNum = 26;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10, 2);
        type = new Type[]{Type.getType(TypeElectric.SPOT)};
        gender = setGender();
        captureRate = 75;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(90, 0, 0, temp, ((180 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(55, 0, 0, temp, ((110 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(90, 0, 0, temp, ((180 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spDefEVG = 0;
        spdEVG = 4;

        hpEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpDef = 80;
        baseSpd = 110;
        baseHp = 60;

        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackThunder(), new AttackIronTail(), new AttackVoltTackle(), new AttackDischarge()};
    }
}
