package type;

public class TypeBug extends Type{

    public TypeBug(){
        name = "Bug";
        typeAdvantages = new String[][]{{new TypeGrass().getName()}, {new TypeGrass().getName()}};
    }

}