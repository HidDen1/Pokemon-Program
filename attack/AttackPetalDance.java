package attack;

import type.Type;
import type.TypeGrass;

public class AttackPetalDance extends Attack{

    public AttackPetalDance(){
        name = "Petal Dance";
        type = Type.getType(TypeGrass.SPOT);
        physical = false;
        power = 120;
    }

}