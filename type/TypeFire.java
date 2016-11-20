package type;

public class TypeFire extends Type{
    public TypeFire(){
        name = "Fire";
        typeAdvantages = new Type[]{new TypeGrass()};
        typeDisadvantages = new Type[]{new TypeWater()};
    }
}
