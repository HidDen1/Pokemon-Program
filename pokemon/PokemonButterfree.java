package pokemon;

import attack.*;
import type.Type;
import type.TypeBug;
import type.TypeFlying;

public class PokemonButterfree extends Pokemon{

    public PokemonButterfree(int lev){
        name = "Butterfree";
        //id = 4;
        pokeNum = 12;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(45, 0, 0, temp, ((90 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(50, 0, 0, temp, ((100 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(90, 0, 2, temp, ((180 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(80, 0, 1, temp, ((160 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 70;
        baseHp = 60;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackPsybeam(), new AttackBugBite(), new AttackSilverWind(), new AttackBugBuzz()};
    }

}