package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackTackle;
import type.Type;
import type.TypeBug;

public class PokemonCaterpie extends Pokemon{

    public PokemonCaterpie(int lev){
        name = "Caterpie";
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 10; //for the pokedex
        evolution = new PokemonMetapod(lev);
        levEv = 7;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT)};
        atk = (30 * 2 + iv) * lev / 100 + 5;
        def = (35 * 2 + iv) * lev / 100 + 5;
        spAtk = (20 * 2 + iv) * lev / 100 + 5;
        spDef = (20 * 2 + iv) * lev / 100 + 5;
        spd = (45 * 2 + iv) * lev / 100 + 5;
        hp = (45 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackTackle(), new AttackBugBite(), new AttackEmpty(), new AttackEmpty()};
    }

}