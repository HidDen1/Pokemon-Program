package pokemon;

import attack.*;
import type.Type;
import type.TypeBug;
import type.TypePoison;

public class PokemonBeedrill extends Pokemon{

    public PokemonBeedrill(int lev){
        name = "Beedrill";
        //id = 4;
        pokeNum = 15; //for the pokedex
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypePoison.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(90, 0, 2, temp, ((180 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(40, 0, 0, temp, ((80 + temp) * lev / 100 + 5) * nat.getDefBonus());
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

        baseSpAtk = 45;
        baseSpDef = 80;
        baseSpd = 75;
        baseHp = 65;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackPursuit(), new AttackBugBite(), new AttackPoisonJab(), new AttackFellStinger()};
    }

}