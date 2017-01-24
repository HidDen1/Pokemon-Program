package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgeot extends Pokemon{

    public PokemonPidgeot(int lev){
        name = "Pidgeot";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 17; //for the pokedex
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        gender = setGender();
        atk = ((80 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((75 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((70 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((70 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((101 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (83 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackAirSlash(), new AttackHurricane(), new AttackBraveBird(), new AttackSteelWing()};
    }

}