package attack;

import type.Type;
import type.TypeWater;

public class AttackWaterPulse extends Attack{

    public AttackWaterPulse(){
        name = "Water Pulse";
        type = Type.getType(TypeWater.SPOT);
        physical = false;
        power = 60;
    }

}