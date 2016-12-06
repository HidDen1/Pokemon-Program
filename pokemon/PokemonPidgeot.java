package pokemon;

import attack.*;
import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgeot extends Pokemon{

    public PokemonPidgeot(){
        name = "Pidgeot";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 17; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeNormal.SPOT), Type.getType(TypeFlying.SPOT)};
        atk = (80 * 2 + iv) * lev / 100 + 5;
        def = (75 * 2 + iv) * lev / 100 + 5;
        spAtk = (70 * 2 + iv) * lev / 100 + 5;
        spDef = (70 * 2 + iv) * lev / 100 + 5;
        spd = (101 * 2 + iv) * lev / 100 + 5;
        hp = (83 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackAirSlash(), new AttackHurricane(), new AttackBraveBird(), new AttackSteelWing()};
    }

}