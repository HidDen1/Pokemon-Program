package pokemon;

import attack.*;
import type.Type;
import type.TypeGrass;
import type.TypePoison;

public class PokemonIvysaur extends Pokemon{

    public PokemonIvysaur(int lev){
        name = "Ivysaur";
        //id = 1;
        pokeNum = 2;
        evolution = new PokemonVenusaur(lev);
        levEv = 32;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeGrass.SPOT), Type.getType(TypePoison.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(62, 0, 0, temp, ((124 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(63, 0, 0, temp, ((126 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(80, 0, 1, temp, ((160 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spDefEVG = 1;
        spdEVG = 1;

        hpEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpDef = 80;
        baseSpd = 60;
        baseHp = 60;

        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackVineWhip(), new AttackRazorLeaf(), new AttackDoubleEdge(), new AttackSolarbeam()};
    }

}