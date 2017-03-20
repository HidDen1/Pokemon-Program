package attack;

import type.Type;
import type.TypeNormal;

public class AttackSmokeScreen extends Attack{

    public AttackSmokeScreen(){
        name = "Smokescreen";
        type = Type.getType(TypeNormal.SPOT);
        physical = false;
        power = 0;
        description = "The user releases an obscuring cloud of smoke or ink. This lowers the target's accuracy.";
        accuracy = 100;
        powerpoints = 20;
    }
}
