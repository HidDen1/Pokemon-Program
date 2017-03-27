package pokemon;

import attack.*;
import type.Type;
import type.TypeElectric;

public class PokemonPikachu extends Pokemon{
    public PokemonPikachu(int lev) {
        name = "Pikachu";
        //id = 2;
        pokeNum = 25;
        evolution = new PokemonRaichu(lev);
        levEv = 30;
        expMax = Math.pow(lev * 10, 2);
        type = new Type[]{Type.getType(TypeElectric.SPOT)};
        gender = setGender();
        captureRate = 190;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(55, 0, 0, temp, ((110 + temp) * lev / 100 + 5) * nat.getAtkBonus());
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

        baseSpAtk = 50;
        baseSpDef = 50;
        baseSpd = 90;
        baseHp = 35;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackThunderbolt(), new AttackIronTail(), new AttackVoltTackle(), new AttackDischarge()};
    }
}
