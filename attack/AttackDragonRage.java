package attack;

import type.Type;
import type.TypeDragon;

public class AttackDragonRage extends Attack{

    public AttackDragonRage(){
        name = "Dragon Rage";
        type = Type.getType(TypeDragon.SPOT);
        physical = false;
        power = 40;
    }

}