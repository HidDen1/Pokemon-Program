package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackTackle;
import type.Type;
import type.TypeBug;

public class PokemonMetapod extends Pokemon{

    public PokemonMetapod(int lev){
        name = "Metapod";
        //id = 11;
        pokeNum = 11;
        evolution = new PokemonButterfree(lev);
        levEv = 10;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT)};
        gender = setGender();
        captureRate = 120;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(20, 0, 0, temp, ((40 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(55, 0, 2, temp, ((110 + temp) * lev / 100 + 5) * nat.getDefBonus());
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spAtkEVG = 0;
        spDefEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpAtk = 25;
        baseSpDef = 25;
        baseSpd = 30;
        baseHp = 50;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackTackle(), new AttackBugBite(), new AttackEmpty(), new AttackEmpty()};
    }

}