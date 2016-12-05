package attack;

import type.Type;
import type.TypeFire;

public class AttackFireFang extends Attack{

    public AttackFireFang(){
        name = "Fire Fang";
        type = Type.getType(TypeFire.SPOT);
        physical = true;
        power = 65;
    }

}