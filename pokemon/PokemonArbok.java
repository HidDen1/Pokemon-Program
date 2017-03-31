package pokemon;

import attack.*;
import type.Type;
import type.TypePoison;

public class PokemonArbok extends Pokemon{
    public PokemonArbok(int lev){
        name = "Ekans";
        //id = 2;
        pokeNum = 24;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypePoison.SPOT)};
        gender = setGender();
        captureRate = 90;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(95, 0, 2, temp, ((190 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(69, 0, 0, temp, ((138 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(65, 0, 0, temp, ((130 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spDefEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpDef = 79;
        baseSpd = 80;
        baseHp = 60;

        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackGunkShot(), new AttackCrunch(), new AttackAcidSpray(), new AttackFireFang()};
    }
}
