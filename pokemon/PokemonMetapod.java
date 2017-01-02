package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackTackle;
import type.Type;
import type.TypeBug;

public class PokemonMetapod extends Pokemon{

    public PokemonMetapod(int lev){
        name = "Metapod";
        iv = ivGenerator();
        //id = 11;
        //pokeNum = 10; //for the pokedex
        evolution = new PokemonButterfree(lev);
        levEv = 10;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT)};
        atk = (20 * 2 + iv) * lev / 100 + 5;
        def = (55 * 2 + iv) * lev / 100 + 5;
        spAtk = (25 * 2 + iv) * lev / 100 + 5;
        spDef = (25 * 2 + iv) * lev / 100 + 5;
        spd = (30 * 2 + iv) * lev / 100 + 5;
        hp = (50 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackTackle(), new AttackBugBite(), new AttackEmpty(), new AttackEmpty()};
    }

}