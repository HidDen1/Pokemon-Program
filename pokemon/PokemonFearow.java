package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonFearow extends Pokemon{
    public PokemonFearow(int lev){
        name = "Fearow";
        //id = 2;
        pokeNum = 22;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT) , Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        captureRate = 90;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(90, 0, 0, temp, ((180 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        defIV = ivGenerator();
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        defEVG = 0;
        spAtkEVG = 0;
        spDefEVG = 0;
        spdEVG = 3;

        hpEV = 0;
        defEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseDef = 65;
        baseSpAtk = 61;
        baseSpDef = 61;
        baseSpd = 100;
        baseHp = 65;

        def = ((baseDef * 2 + defIV + defEV / 4) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackAerialAce(), new AttackAssurance(), new AttackDrillPeck(), new AttackDrillRun()};
    }
}
