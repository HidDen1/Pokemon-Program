package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonWartortle extends Pokemon{

    public PokemonWartortle(int lev){
        name = "Wartortle";
        //id = 3;
        pokeNum = 8;
        evolution = new PokemonBlastoise(lev);
        levEv = 36;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(63, 0, 0, temp, ((126 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(80, 0, 1, temp, ((160 + temp) * lev / 100 + 5) * nat.getDefBonus());
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spAtkEVG = 0;
        spDefEVG = 1;
        spdEVG = 1;

        hpEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpAtk = 65;
        baseSpDef = 80;
        baseSpd = 58;
        baseHp = 59;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackAquaTail(), new AttackIceBeam(), new AttackBite(), new AttackBrine()};
    }

}