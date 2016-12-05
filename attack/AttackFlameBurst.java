package attack;

import type.Type;
import type.TypeFire;

public class AttackFlameBurst extends Attack{

    public AttackFlameBurst(){
        name = "Flame Burst";
        type = Type.getType(TypeFire.SPOT);
        physical = false;
        power = 70;
    }

}