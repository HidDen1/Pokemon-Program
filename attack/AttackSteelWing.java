package attack;

import type.Type;
import type.TypeSteel;

public class AttackSteelWing extends Attack{

    public AttackSteelWing(){
        name = "Steel Wing";
        type = Type.getType(TypeSteel.SPOT);
        physical = true;
        power = 70;
    }

}