package pokemon;

import attack.*;
import type.Type;
import type.TypeGrass;

public class PokemonBulbasaur extends Pokemon{

    public PokemonBulbasaur(){
        name = "Bulbasaur";
        iv = ivGenerator(); //will need seperate generators for each stats IVs
        //id = 1;
        //pokeNum = 1; //for the pokedex
        evolution = new PokemonIvysaur();
        levEv = 16;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeGrass.SPOT)};
        atk = (49 * 2 + iv) * lev / 100 + 5;
        def = (49 * 2 + iv) * lev / 100 + 5;
        spAtk = (65 * 2 + iv) * lev / 100 + 5;
        spDef = (65 * 2 + iv) * lev / 100 + 5;
        spd = (45 * 2 + iv) * lev / 100 + 5;
        hp = (45 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackVineWhip(), new AttackRazorLeaf(), new AttackSeedBomb(), new AttackSolarbeam()};
    }

}