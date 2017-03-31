package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonSquirtle extends Pokemon{

    public PokemonSquirtle(int lev){
        name = "Squirtle";
        //id = 3;
        pokeNum = 7;
        evolution = new PokemonWartortle(lev);
        levEv = 16;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(48, 0, 0, temp, ((96 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(65, 0, 1, temp, ((130 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(50, 0, 0, temp, ((100 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
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

        baseSpDef = 64;
        baseSpd = 43;
        baseHp = 44;

        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackWaterGun(), new AttackWaterPulse(), new AttackBite(), new AttackBrine()};
    }

}