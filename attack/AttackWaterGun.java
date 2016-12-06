package attack;

import type.Type;
import type.TypeWater;

public class AttackWaterGun extends Attack{

    public AttackWaterGun(){
        name = "Water Gun";
        type = Type.getType(TypeWater.SPOT);
        physical = false;
        power = 40;
    }

}