package attack;

import type.Type;
import type.TypeGrass;

public class AttackSolarbeam extends Attack{

    public AttackSolarbeam(){
        name = "Solarbeam";
        type = Type.getType(TypeGrass.SPOT);
        physical = false;
        power = 120;
    }

}