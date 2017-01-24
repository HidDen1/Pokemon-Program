package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackPoisonSting;
import type.Type;
import type.TypeBug;
import type.TypePoison;

public class PokemonWeedle extends Pokemon{

    public PokemonWeedle(int lev){
        name = "Weedle";
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 13; //for the pokedex
        evolution = new PokemonKakuna(lev);
        levEv = 7;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypePoison.SPOT)};
        gender = setGender();
        atk = ((35 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((30 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((20 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((20 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((50 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (40 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackPoisonSting(), new AttackBugBite(), new AttackEmpty(),new AttackEmpty()};
    }

}