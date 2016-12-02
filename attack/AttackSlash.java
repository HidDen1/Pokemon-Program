package attack;

import type.Type;
import type.TypeNormal;

public class AttackSlash extends Attack{

    public AttackSlash(){
        name = "Slash";
        type = Type.getType(TypeNormal.SPOT);
        physical = true;
        power = 70;
    }

}