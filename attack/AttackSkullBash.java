package attack;

import type.Type;
import type.TypeNormal;

public class AttackSkullBash extends Attack{

    public AttackSkullBash(){
        name = "Skull Bash";
        type = Type.getType(TypeNormal.SPOT);
        physical = true;
        power = 130;
    }

}