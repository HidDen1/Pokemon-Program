package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonSpearow extends Pokemon{
    public PokemonSpearow(int lev){
        name = "Spearow";
        //id = 2;
        pokeNum = 21;
        evolution = new PokemonFearow(lev);
        levEv = 20;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT) , Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        captureRate = 255;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(60, 0, 0, temp, ((120 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(30, 0, 0, temp, ((60 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(31, 0, 0, temp, ((62 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spDefEVG = 0;
        spdEVG = 2;

        hpEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpDef = 31;
        baseSpd = 70;
        baseHp = 40;

        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackAerialAce(), new AttackAssurance(), new AttackPursuit(), new AttackFuryAttack()};
    }
}
