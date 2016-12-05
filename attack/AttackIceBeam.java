package attack;

import type.Type;
import type.TypeIce;

public class AttackIceBeam extends Attack{

    public AttackIceBeam(){
        name = "Ice Beam";
        type = Type.getType(TypeIce.SPOT);
        physical = true;
        power = 60;
    }

}