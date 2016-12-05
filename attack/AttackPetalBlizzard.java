package attack;

import type.Type;
import type.TypeGrass;

public class AttackPetalBlizzard extends Attack{

    public AttackPetalBlizzard(){
        name = "Petal Blizzard";
        type = Type.getType(TypeGrass.SPOT);
        physical = true;
        power = 90;
    }

}