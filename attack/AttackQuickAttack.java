package attack;

import type.Type;
import type.TypeNormal;

public class AttackQuickAttack extends Attack{

    public AttackQuickAttack(){
        name = "Quick Attack";
        type = Type.getType(TypeNormal.SPOT);
        physical = true;
        power = 40;
    }

}