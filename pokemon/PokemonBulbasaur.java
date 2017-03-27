package pokemon;

import attack.*;
import type.Type;
import type.TypeGrass;

public class PokemonBulbasaur extends Pokemon{

    public PokemonBulbasaur(int lev){
        name = "Bulbasaur";
        //id = 1;
        pokeNum = 1;
        evolution = new PokemonIvysaur(lev);
        levEv = 16;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeGrass.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(49, 0, 0, temp, ((98 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(49, 0, 0, temp, ((98 + temp) * lev / 100 + 5) * nat.getDefBonus());
        spAtkIV = ivGenerator();
        spDefIV = ivGenerator();
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spAtkEVG = 1;
        spDefEVG = 1;
        spdEVG = 1;

        hpEV = 0;
        spAtkEV = 0;
        spDefEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpAtk = 65;
        baseSpDef = 65;
        baseSpd = 45;
        baseHp = 45;

        spAtk = ((baseSpAtk * 2 + spAtkIV + spAtkEV / 4) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((baseSpDef * 2 + spDefIV + spDefEV / 4) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackVineWhip(), new AttackRazorLeaf(), new AttackSeedBomb(), new AttackSolarbeam()};
    }

}