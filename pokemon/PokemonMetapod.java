package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackTackle;
import type.Type;
import type.TypeBug;

public class PokemonMetapod extends Pokemon{

    public PokemonMetapod(int lev){
        name = "Metapod";
        iv = ivGenerator();
        //id = 11;
        //pokeNum = 10; //for the pokedex
        evolution = new PokemonButterfree(lev);
        levEv = 10;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT)};
        gender = setGender();
        atk = ((20 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((55 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((25 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((25 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((30 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (50 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackTackle(), new AttackBugBite(), new AttackEmpty(), new AttackEmpty()};
    }

}