package pokemon;

import attack.*;
import type.Type;
import type.TypeBug;
import type.TypeFlying;

public class PokemonButterfree extends Pokemon{

    public PokemonButterfree(int lev){
        name = "Butterfree";
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 12; //for the pokedex
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        atk = ((45 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((50 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((90 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((80 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((70 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (60 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackPsybeam(), new AttackBugBite(), new AttackSilverWind(), new AttackBugBuzz()};
    }

}