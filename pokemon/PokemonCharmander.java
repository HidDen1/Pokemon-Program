package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;

public class PokemonCharmander extends Pokemon{

    public PokemonCharmander(){
        name = "Charmander";
        iv = ivGenerator();
        //id = 2;
        //pokeNum = 4;
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT)};
        atk = (52 * 2 + iv) * lev / 100 + 5;
        def = (43 * 2 + iv) * lev / 100 + 5;
        spAtk = (60 * 2 + iv) * lev / 100 + 5;
        spDef = (50 * 2 + iv) * lev / 100 + 5;
        spd = (65 * 2 + iv) * lev / 100 + 5;
        hp = (39 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackEmber(), new AttackDragonRage(), new AttackFireFang(), new AttackFlamethrower()};
    }

}