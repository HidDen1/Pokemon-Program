package type;

public class TypeDragon extends Type{

    public TypeDragon(){
        name = "Dragon";
        typeAdvantages = new String[][]{{name}, {new TypeFire().getName(), new TypeWater().getName(), new TypeGrass().getName()}};
    }

}
