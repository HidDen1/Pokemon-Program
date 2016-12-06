package attack;

import type.Type;
import type.TypeNormal;

public class AttackTackle extends Attack{

    public AttackTackle(){
        name = "Tackle";
        type = Type.getType(TypeNormal.SPOT);
        physical = true;
        power = 50;
    }

}