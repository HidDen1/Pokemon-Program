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
        temp = ivGenerator();
        getSpAtk().setAll(80, 0, 1, temp, ((160 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(65, 0, 0, temp, ((130 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 2;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 80;
        baseHp = 58;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackSlash(), new AttackDragonRage(), new AttackFlameBurst(), new AttackFlamethrower()};
    }

}