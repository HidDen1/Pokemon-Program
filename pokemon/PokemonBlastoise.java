package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonBlastoise extends Pokemon{

    public PokemonBlastoise(int lev){
        name = "Blastoise";
        //id = 3;
        pokeNum = 9;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(83, 0, 0, temp, ((166 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(100, 0, 0, temp, ((200 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(85, 0, 0, temp, ((170 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(105, 0, 3, temp, ((210 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 78;
        baseHp = 79;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackAquaTail(), new AttackIceBeam(), new AttackSkullBash(), new AttackHydroPump()};
    }

}