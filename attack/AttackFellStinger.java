package attack;

import type.Type;
import type.TypeBug;

public class AttackFellStinger extends Attack{

    public AttackFellStinger(){
        name = "Fell Stinger";
        type = Type.getType(TypeBug.SPOT);
        physical = true;
        power = 30;
    }

}