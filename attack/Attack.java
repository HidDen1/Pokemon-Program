package attack;

import type.Type;

public abstract class Attack {
    protected String name;
    protected Type type;
    protected boolean physical;
    protected int power;

    public String getName(){
        return name;
    }

    public Type getType(){
        return type;
    }

    public boolean isPhysical(){
        return physical;
    }

    public int getPower(){
        return power;
    }
}
