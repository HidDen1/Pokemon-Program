package attack;

import type.Type;
import type.TypeDark;

public class AttackBite extends Attack{

    public AttackBite(){
        name = "Bite";
        type = Type.getType(TypeDark.SPOT);
        physical = true;
        power = 60;
    }

}