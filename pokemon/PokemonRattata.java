package pokemon;

import attack.*;
import type.Type;
import type.TypeNormal;

public class PokemonRattata extends Pokemon{
    public PokemonRattata(int lev){
        name = "Rattata";
        //id = 2;
        pokeNum = 19;
        evolution = new PokemonRaticate(lev);
        levEv = 20;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT)};
        gender = setGender();
        captureRate = 255;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(56, 0, 0, temp, ((112 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(35, 0, 0, temp, ((70 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(25, 0, 0, temp, ((50 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(35, 0, 0, temp, ((70 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 2;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 72;
        baseHp = 30;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackQuickAttack(), new AttackBite(), new AttackPursuit(), new AttackHyperFang()};
    }
}
