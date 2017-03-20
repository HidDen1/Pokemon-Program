package pokemon;

import attack.*;
import type.Type;
import type.TypePoison;

public class PokemonEkans extends Pokemon{
    public PokemonEkans(int lev){
        name = "Ekans";
        //id = 2;
        pokeNum = 22;
        evolution = new PokemonArbok(lev);
        levEv = 23;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypePoison.SPOT)};
        gender = setGender();
        captureRate = 255;
        nat = natureAssigner();
        double temp = ivGenerator();;
        getAtk().setAll(60, 0, 1, temp, ((120 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        defIV = ivGenerator();
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        defEVG = 0;
        spAtkEVG = 0;
        spDefEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        defEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseDef = 44;
        baseSpAtk = 40;
        baseSpDef = 54;
        baseSpd = 55;
        baseHp = 45;

        def = ((baseDef * 2 + defIV + defEV / 4) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackBite(), new AttackAcid(), new AttackAcidSpray(), new AttackMudBomb()};
    }
}

