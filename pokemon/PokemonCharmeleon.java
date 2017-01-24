package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;

public class PokemonCharmeleon extends Pokemon{

    public PokemonCharmeleon(int lev){
        name = "Charmeleon";
        iv = ivGenerator();
        //id = 2;
        //pokeNum = 5;
        evolution = new PokemonCharizard(lev);
        levEv = 36;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT)};
        gender = setGender();
        atk = ((64 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((58 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((80 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((65 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((80 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (58 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackSlash(), new AttackDragonRage(), new AttackFlameBurst(), new AttackFlamethrower()};
    }

}