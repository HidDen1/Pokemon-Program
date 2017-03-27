package pokemon;

import attack.*;
import type.Type;
import type.TypeGrass;
import type.TypePoison;

public class PokemonVenusaur extends Pokemon{

    public PokemonVenusaur(int lev){
        name = "Venusaur";
        //id = 1;
        pokeNum = 3;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeGrass.SPOT), Type.getType(TypePoison.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(82, 0, 0, temp, ((164 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(83, 0, 0, temp, ((166 + temp) * lev / 100 + 5) * nat.getDefBonus());
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spAtkEVG = 2;
        spDefEVG = 1;
        spdEVG = 1;

        hpEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpAtk = 100;
        baseSpDef = 100;
        baseSpd = 80;
        baseHp = 80;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackPetalDance(), new AttackPetalBlizzard(), new AttackDoubleEdge(), new AttackSolarbeam()};
    }

}