package pokemon;

import attack.*;
import type.Type;
import type.TypeBug;
import type.TypePoison;

public class PokemonBeedrill extends Pokemon{

    public PokemonBeedrill(int lev){
        name = "Beedrill";
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 10; //for the pokedex
        evolution = null;
        levEv = 101;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypePoison.SPOT)};
        atk = (90 * 2 + iv) * lev / 100 + 5;
        def = (40 * 2 + iv) * lev / 100 + 5;
        spAtk = (45 * 2 + iv) * lev / 100 + 5;
        spDef = (80 * 2 + iv) * lev / 100 + 5;
        spd = (75 * 2 + iv) * lev / 100 + 5;
        hp = (65 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackPursuit(), new AttackBugBite(), new AttackPoisonJab(), new AttackFellStinger()};
    }

}