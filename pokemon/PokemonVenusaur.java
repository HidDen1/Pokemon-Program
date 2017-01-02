package pokemon;

import attack.*;
import type.Type;
import type.TypeGrass;
import type.TypePoison;

public class PokemonVenusaur extends Pokemon{

    public PokemonVenusaur(int lev){
        name = "Venusaur";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 2;
        evolution = null;
        levEv = 101;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeGrass.SPOT), Type.getType(TypePoison.SPOT)};
        atk = (82 * 2 + iv) * lev / 100 + 5;
        def = (83 * 2 + iv) * lev / 100 + 5;
        spAtk = (100 * 2 + iv) * lev / 100 + 5;
        spDef = (100 * 2 + iv) * lev / 100 + 5;
        spd = (80 * 2 + iv) * lev / 100 + 5;
        hp = (80 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackPetalDance(), new AttackPetalBlizzard(), new AttackDoubleEdge(), new AttackSolarbeam()};
    }

}