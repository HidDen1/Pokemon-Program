package attack;

import type.Type;
import type.TypeWater;

public class AttackAquaTail extends Attack{

    public AttackAquaTail(){
        name = "Aqua Tail";
        type = Type.getType(TypeWater.SPOT);
        physical = true;
        power = 90;
    }

}