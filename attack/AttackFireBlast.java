package attack;

import type.Type;
import type.TypeFire;

public class AttackFireBlast extends Attack{

    public AttackFireBlast(){
        name = "Fire Blast";
        type = Type.getType(TypeFire.SPOT);
        physical = false;
        power = 120;
    }

}