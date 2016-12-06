package attack;

import type.Type;
import type.TypeDragon;

public class AttackTwister extends Attack{

    public AttackTwister(){
        name = "Twister";
        type = Type.getType(TypeDragon.SPOT);
        physical = false;
        power = 40;
    }

}