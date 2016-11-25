package pokemon;

import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgeotto extends Pokemon{

    public PokemonPidgeotto(){
        name = "Pidgeotto";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 17; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{new TypeNormal(), new TypeFlying()};
        atk = (60 * 2 + iv) * lev / 100 + 5;
        def = (55 * 2 + iv) * lev / 100 + 5;
        spAtk = (50 * 2 + iv) * lev / 100 + 5;
        spDef = (50 * 2 + iv) * lev / 100 + 5;
        spd = (71 * 2 + iv) * lev / 100 + 5;
        hp = (63 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Air Slash", "Quick Attack", "Twister", "Wing Attack"};
        attPower = new int[]{75, 40, 40, 60};
        attType1 = new String[]{"Flying", "Normal", "Dragon", "Flying"};
        attType2 = new String[]{"Special", "Physical", "Special", "Physical"};
    }

}