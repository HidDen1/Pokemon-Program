package attack;

import type.Type;
import type.TypeGrass;

public class AttackSeedBomb extends Attack{

    public AttackSeedBomb(){
        name = "Seed Bomb";
        type = Type.getType(TypeGrass.SPOT);
        physical = true;
        power = 80;
    }

}