package attack;

import type.Type;
import type.TypeWater;

public class AttackHydroPump extends Attack{

    public AttackHydroPump(){
        name = "Hydro Pump";
        type = Type.getType(TypeWater.SPOT);
        physical = false;
        power = 110;
    }

}