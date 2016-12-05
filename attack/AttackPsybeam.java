package attack;

import type.Type;
import type.TypePsychic;

public class AttackPsybeam extends Attack{

    public AttackPsybeam(){
        name = "Psybeam";
        type = Type.getType(TypePsychic.SPOT);
        physical = false;
        power = 65;
    }

}