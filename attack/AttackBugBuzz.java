package attack;

import type.Type;
import type.TypeBug;

public class AttackBugBuzz extends Attack{

    public AttackBugBuzz(){
        name = "Bug Buzz";
        type = Type.getType(TypeBug.SPOT);
        physical = false;
        power = 90;
    }

}