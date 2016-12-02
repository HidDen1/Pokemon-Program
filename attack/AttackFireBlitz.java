package attack;

import type.Type;
import type.TypeFire;

public class AttackFireBlitz extends Attack{

    public AttackFireBlitz(){
        name = "Fire Blitz";
        type = Type.getType(TypeFire.SPOT);
        physical = true;
        power = 120;
    }

}