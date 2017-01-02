package pokemon;

import attack.*;
import type.Type;
import type.TypeGrass;
import type.TypePoison;

public class PokemonIvysaur extends Pokemon{

    public PokemonIvysaur(int lev){
        name = "Ivysaur";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 2;
        evolution = new PokemonVenusaur(lev);
        levEv = 32;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeGrass.SPOT), Type.getType(TypePoison.SPOT)};
        atk = (62 * 2 + iv) * lev / 100 + 5;
        def = (63 * 2 + iv) * lev / 100 + 5;
        spAtk = (80 * 2 + iv) * lev / 100 + 5;
        spDef = (80 * 2 + iv) * lev / 100 + 5;
        spd = (60 * 2 + iv) * lev / 100 + 5;
        hp = (60 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackVineWhip(), new AttackRazorLeaf(), new AttackDoubleEdge(), new AttackSolarbeam()};
    }

}