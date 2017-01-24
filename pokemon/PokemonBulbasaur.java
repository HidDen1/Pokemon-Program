package pokemon;

import attack.*;
import type.Type;
import type.TypeGrass;

public class PokemonBulbasaur extends Pokemon{

    public PokemonBulbasaur(int lev){
        name = "Bulbasaur";
        iv = ivGenerator(); //will need seperate generators for each stats IVs
        //id = 1;
        //pokeNum = 1; //for the pokedex
        evolution = new PokemonIvysaur(lev);
        levEv = 16;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeGrass.SPOT)};
        gender = setGender();
        atk = ((49 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((49 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((65 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((65 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((45 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (45 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackVineWhip(), new AttackRazorLeaf(), new AttackSeedBomb(), new AttackSolarbeam()};
    }

}