package attack;

import type.Type;
import type.TypeWater;

public class AttackBrine extends Attack{

    public AttackBrine(){
        name = "Brine";
        type = Type.getType(TypeWater.SPOT);
        physical = false;
        power = 65;
    }

}