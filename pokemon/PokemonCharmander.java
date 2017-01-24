package pokemon;

import attack.*;
import type.Type;
import type.TypeFire;

public class PokemonCharmander extends Pokemon{

    public PokemonCharmander(int lev){
        name = "Charmander";
        iv = ivGenerator(); //needs to be used for each IV and kept when evolving
        //id = 2;
        //pokeNum = 4;
        evolution = new PokemonCharmeleon(lev);
        levEv = 16;
        expMax = Math.pow(lev * 10 , 2);
        type = new Type[]{Type.getType(TypeFire.SPOT)};
        //Ability
        gender = setGender();//(needs kept after evolving)
        //Capture Rate (set)
        nat = natureAssigner(); //(needs kept after evolving)
        //EVs gained from fainting Pokemon (set)
        //Pokemon's EVs (needs kept after evolving)
        atk = ((52 * 2 + iv) * lev / 100 + 5) * nat.getAtkBonus();
        def = ((43 * 2 + iv) * lev / 100 + 5) * nat.getDefBonus();
        spAtk = ((60 * 2 + iv) * lev / 100 + 5) * nat.getSpAtkBonus();
        spDef = ((50 * 2 + iv) * lev / 100 + 5) * nat.getSpDefBonus();
        spd = ((65 * 2 + iv) * lev / 100 + 5) * nat.getSpdBonus();
        hpMax = (39 * 2 + iv) * lev / 100 + 10;
        att = new Attack[]{new AttackEmber(), new AttackDragonRage(), new AttackFireFang(), new AttackFlamethrower()};
    }

}