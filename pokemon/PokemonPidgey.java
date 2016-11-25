package pokemon;

import type.Type;
import type.TypeFlying;
import type.TypeNormal;

public class PokemonPidgey extends Pokemon{

    public PokemonPidgey(){
        name = "Pidgey";
        iv = ivGenerator();
        //id = 1;
        //pokeNum = 16; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = new Type[]{new TypeNormal(), new TypeFlying()};
        atk = (45 * 2 + iv) * lev / 100 + 5;
        def = (40 * 2 + iv) * lev / 100 + 5;
        spAtk = (35 * 2 + iv) * lev / 100 + 5;
        spDef = (35 * 2 + iv) * lev / 100 + 5;
        spd = (56 * 2 + iv) * lev / 100 + 5;
        hp = (40 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Gust", "Quick Attack", "Twister", "Wing Attack"};
        attPower = new int[]{40, 40, 40, 60};
        attType1 = new String[]{"Flying", "Normal", "Dragon", "Flying"};
        attType2 = new String[]{"Special", "Physical", "Special", "Physical"};
    }

}