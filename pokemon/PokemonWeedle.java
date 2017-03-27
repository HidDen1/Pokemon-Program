package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackPoisonSting;
import type.Type;
import type.TypeBug;
import type.TypePoison;

public class PokemonWeedle extends Pokemon{

    public PokemonWeedle(int lev){
        name = "Weedle";
        //id = 4;
        pokeNum = 13;
        evolution = new PokemonKakuna(lev);
        levEv = 7;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypePoison.SPOT)};
        gender = setGender();
        captureRate = 255;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(35, 0, 0, temp, ((70 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(30, 0, 0, temp, ((60 + temp) * lev / 100 + 5) * nat.getDefBonus());
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spAtkEVG = 0;
        spDefEVG = 0;
        spdEVG = 2;

        hpEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpAtk = 20;
        baseSpDef = 20;
        baseSpd = 50;
        baseHp = 40;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackPoisonSting(), new AttackBugBite(), new AttackEmpty(),new AttackEmpty()};
    }

}