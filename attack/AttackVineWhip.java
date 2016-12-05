package attack;

import type.Type;
import type.TypeGrass;

public class AttackVineWhip extends Attack{

    public AttackVineWhip(){
        name = "Vine Whip";
        type = Type.getType(TypeGrass.SPOT);
        physical = true;
        power = 45;
    }

}