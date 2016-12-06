package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;

public class PokemonCharmeleon extends Pokemon{

    public PokemonCharmeleon(){
        name = "Charmeleon";
        iv = ivGenerator();
        //id = 2;
        //pokeNum = 5;
        evolution = new PokemonCharizard();
        levEv = 36;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT)};
        atk = (64 * 2 + iv) * lev / 100 + 5;
        def = (58 * 2 + iv) * lev / 100 + 5;
        spAtk = (80 * 2 + iv) * lev / 100 + 5;
        spDef = (65 * 2 + iv) * lev / 100 + 5;
        spd = (80 * 2 + iv) * lev / 100 + 5;
        hp = (58 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackSlash(), new AttackDragonRage(), new AttackFlameBurst(), new AttackFlamethrower()};
    }

}