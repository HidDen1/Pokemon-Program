package attack;

import type.Type;
import type.TypeFire;

public class AttackHeatWave extends Attack{

    public AttackHeatWave(){
        name = "Heat Wave";
        type = Type.getType(TypeFire.SPOT);
        physical = false;
        power = 90;
    }

}