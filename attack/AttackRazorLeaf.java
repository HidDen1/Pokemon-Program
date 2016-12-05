package attack;

import type.Type;
import type.TypeGrass;

public class AttackRazorLeaf extends Attack{

    public AttackRazorLeaf(){
        name = "Razorleaf";
        type = Type.getType(TypeGrass.SPOT);
        physical = true;
        power = 55;
    }

}