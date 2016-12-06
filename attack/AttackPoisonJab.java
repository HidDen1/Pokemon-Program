package attack;

import type.Type;
import type.TypePoison;

public class AttackPoisonJab extends Attack{

    public AttackPoisonJab(){
        name = "Poison Jab";
        type = Type.getType(TypePoison.SPOT);
        physical = true;
        power = 80;
    }

}