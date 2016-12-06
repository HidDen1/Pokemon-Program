package attack;

import type.Type;
import type.TypeFlying;

public class AttackGust extends Attack{

    public AttackGust(){
        name = "Gust";
        type = Type.getType(TypeFlying.SPOT);
        physical = false;
        power = 40;
    }

}