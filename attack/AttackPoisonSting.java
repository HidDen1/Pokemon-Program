package attack;

import type.Type;
import type.TypePoison;

public class AttackPoisonSting extends Attack{

    public AttackPoisonSting(){
        name = "Poison Sting";
        type = Type.getType(TypePoison.SPOT);
        physical = true;
        power = 15;
    }

}