package type;

public class TypeWater extends Type{

    public TypeWater(){
        name = "Water";
        typeDisadvantages = new Type[]{new TypeGrass()};
    }
}
