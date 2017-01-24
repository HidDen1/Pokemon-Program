package pokemon;

import attack.Attack;
import attack.AttackBugBite;
import attack.AttackEmpty;
import attack.AttackPoisonSting;
import type.Type;
import type.TypeBug;
import type.TypePoison;

public class PokemonKakuna extends Pokemon{

    public PokemonKakuna(int lev){
        name = "Kakuna";
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 15; //for the pokedex
        evolution = new PokemonBeedrill(lev);
        levEv = 10;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeBug.SPOT), Type.getType(TypePoison.SPOT)};
        gender = setGender();
        atk = ((25 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((50 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((25 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((25 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((35 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (45 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackPoisonSting(), new AttackBugBite(), new AttackEmpty(), new AttackEmpty()};
    }

}