package attack;

import type.Type;
import type.TypeFlying;

public class AttackBraveBird extends Attack{

    public AttackBraveBird(){
        name = "Brave Bird";
        type = Type.getType(TypeFlying.SPOT);
        physical = true;
        power = 120;
    }

}