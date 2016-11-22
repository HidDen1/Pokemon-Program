package type;

public class TypeWater extends Type{

    public TypeWater(){
        name = "Water";
        typeAdvantages = new String[][]{{new TypeFire().getName()}, {new TypeFire().getName(), this.getName()}};
    }
}
