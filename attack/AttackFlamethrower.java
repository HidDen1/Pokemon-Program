package attack;

import type.Type;
import type.TypeFire;

public class AttackFlamethrower extends Attack{

    public AttackFlamethrower(){
        name = "Flamethrower";
        type = Type.getType(TypeFire.SPOT);
        physical = false;
        power = 90;
    }

}