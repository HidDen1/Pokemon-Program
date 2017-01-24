package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackTackle;
import type.Type;
import type.TypeBug;

public class PokemonCaterpie extends Pokemon{

    public PokemonCaterpie(int lev){
        name = "Caterpie";
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 10; //for the pokedex
        evolution = new PokemonMetapod(lev);
        levEv = 7;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT)};
        gender = setGender();
        atk = ((30 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((35 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((20 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((20 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((45 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (45 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackTackle(), new AttackBugBite(), new AttackEmpty(), new AttackEmpty()};
    }

}