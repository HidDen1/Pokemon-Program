package attack;

import type.Type;
import type.TypeFlying;

public class AttackHurricane extends Attack{

    public AttackHurricane(){
        name = "Hurricane";
        type = Type.getType(TypeFlying.SPOT);
        physical = false;
        power = 110;
    }

}