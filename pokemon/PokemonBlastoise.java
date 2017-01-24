package pokemon;

import attack.*;
import type.Type;
import type.TypeWater;

public class PokemonBlastoise extends Pokemon{

    public PokemonBlastoise(int lev){
        name = "Blastoise";
        iv = ivGenerator();
        //id = 3;
        //pokeNum = 9;
        evolution = null;
        levEv = 101;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeWater.SPOT)};
        gender = setGender();
        atk = ((83 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((100 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((85 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((105 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((78 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (79 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackAquaTail(), new AttackIceBeam(), new AttackSkullBash(), new AttackHydroPump()};
    }

}