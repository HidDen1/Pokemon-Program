package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;

public class PokemonCharmander extends Pokemon{

    public PokemonCharmander(int lev){ //Abilities still need added
        name = "Charmander";
        //id = 2;
        pokeNum = 4;
        evolution = new PokemonCharmeleon(lev);
        levEv = 16;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT)};
        gender = setGender();
        captureRate = 45;
        nat = natureAssigner();
        held = null;

        double temp = ivGenerator();
        getAtk().setAll(52, 0, 0, temp, ((104 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(43, 0, 0, temp, ((86 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(60, 0, 0, temp, ((120 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(50, 0, 0, temp, ((100 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 2;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 65;
        baseHp = 39;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;

        attLevel = new int[]{0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46};
        atts = new Attack[]{new AttackScratch(), new AttackGrowl(), new AttackEmber(), new AttackSmokeScreen(), new AttackDragonRage(), new AttackScaryFace(), new AttackFireFang(), new AttackFlameBurst(), new AttackSlash(), new AttackFlamethrower(), new AttackFireSpin(), new AttackInferno()};
        att = new Attack[]{new AttackEmpty(), new AttackEmpty(), new AttackEmpty(), new AttackEmpty()};
        getInitialAttacks();
    }

}