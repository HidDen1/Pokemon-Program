package attack;

import type.Type;
import type.TypeDark;

public class AttackPursuit extends Attack{

    public AttackPursuit(){
        name = "Pursuit";
        type = Type.getType(TypeDark.SPOT);
        physical = true;
        power = 40;
    }

}