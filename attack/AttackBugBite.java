package attack;

import type.Type;
import type.TypeBug;

public class AttackBugBite extends Attack{

    public AttackBugBite(){
        name = "Bug Bite";
        type = Type.getType(TypeBug.SPOT);
        physical = true;
        power = 60;
    }

}