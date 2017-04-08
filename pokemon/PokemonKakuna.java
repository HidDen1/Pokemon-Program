package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackPoisonSting;
import type.Type;
import type.TypeBug;
import type.TypePoison;

public class PokemonKakuna extends Pokemon{

    public PokemonKakuna(int lev){
        name = "Kakuna";
        //id = 4;
        pokeNum = 14;
        evolution = new PokemonBeedrill(lev);
        levEv = 10;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypePoison.SPOT)};
        gender = setGender();
        captureRate = 120;
        nat = natureAssigner();

        double temp = ivGenerator();
        getAtk().setAll(25, 0, 0, temp, ((50 + temp) * lev / 100 + 5) * nat.getAtkBonus());
        temp = ivGenerator();
        getDef().setAll(50, 0, 2, temp, ((100 + temp) * lev / 100 + 5) * nat.getDefBonus());
        temp = ivGenerator();
        getSpAtk().setAll(25, 0, 0, temp, ((50 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        temp = ivGenerator();
        getSpDef().setAll(25, 0, 0, temp, ((50 + temp) * lev/100 + 5) * nat.getSpAtkBonus());
        spdIV = ivGenerator();
        hpIV = ivGenerator();

        hpEVG = 0;
        spdEVG = 1;

        hpEV = 0;
        spdEV = 0;
        totalEV = 0;

        baseSpd = 35;
        baseHp = 45;

        spd = ((baseSpd * 2 + spdIV + spdEV / 4) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (baseHp * 2 + hpIV + hpEV  / 4) * lev / 100 + 10;
        att = new Attack[]{new AttackPoisonSting(), new AttackBugBite(), new AttackEmpty(), new AttackEmpty()};
    }

}