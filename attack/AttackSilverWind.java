package attack;

import type.Type;
import type.TypeBug;

public class AttackSilverWind extends Attack{

    public AttackSilverWind(){
        name = "Silver Wind";
        type = Type.getType(TypeBug.SPOT);
        physical = false;
        power = 60;
    }

}