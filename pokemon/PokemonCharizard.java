package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;
import type.TypeFlying;

public class PokemonCharizard extends Pokemon{

    public PokemonCharizard(int lev){
        name = "Charizard";
        //id = 2;
        pokeNum = 6;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(84, 0, 0, temp, ((168 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(78, 0, 0, temp, ((156 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(109, 0, 3, temp, ((218 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(85, 0, 0, temp, ((170 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 100;
        baseHp = 78;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackFireBlitz(), new AttackFireBlast(), new AttackHeatWave(), new AttackFlamethrower()};
    }

}