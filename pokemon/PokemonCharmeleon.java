package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;

public class PokemonCharmeleon extends Pokemon{

    public PokemonCharmeleon(int lev){
        name = "Charmeleon";
        //id = 2;
        pokeNum = 5;
        evolution = new PokemonCharizard(lev);
        levEv = 36;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(64, 0, 0, temp, ((128 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(58, 0, 0, temp, ((116 + temp) * lev / 100 + 5) * nat.getDefBonus());
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spAtkEVG = 1;
        spDefEVG = 0;
        spdEVG = 2;

        hpEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpAtk = 80;
        baseSpDef = 65;
        baseSpd = 80;
        baseHp = 58;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackSlash(), new AttackDragonRage(), new AttackFlameBurst(), new AttackFlamethrower()};
    }

}