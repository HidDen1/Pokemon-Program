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
        temp = ivGenerator();
        getDef().setAll(44, 0, 0, temp, ((88 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(40, 0, 0, temp, ((80 + temp) * lev / 100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(54, 0, 0, temp, ((108 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 55;
        baseHp = 45;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackBite(), new AttackAcid(), new AttackAcidSpray(), new AttackMudBomb()};
    }
}

