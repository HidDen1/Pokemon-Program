package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonSquirtle extends Pokemon{

    public PokemonSquirtle(int lev){
        name = "Squirtle";
        iv = ivGenerator();
        //id = 3;
        //pokeNum = 7;
        evolution = new PokemonWartortle(lev);
        levEv = 16;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        gender = setGender();
        atk = ((48 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((65 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((50 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((64 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((43 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (44 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackWaterGun(), new AttackWaterPulse(), new AttackBite(), new AttackBrine()};
    }

}