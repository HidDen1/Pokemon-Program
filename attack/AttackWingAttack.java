package attack;

import type.Type;
import type.TypeFlying;

public class AttackWingAttack extends Attack{

    public AttackWingAttack(){
        name = "Wing Attack";
        type = Type.getType(TypeFlying.SPOT);
        physical = true;
        power = 60;
    }

}