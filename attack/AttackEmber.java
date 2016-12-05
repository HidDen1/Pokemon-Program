package attack;

import type.Type;
import type.TypeFire;

public class AttackEmber extends Attack{

    public AttackEmber(){
        name = "Ember";
        type = Type.getType(TypeFire.SPOT);
        physical = false;
        power = 40;
    }

}