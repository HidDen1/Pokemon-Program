package type;

public class TypeBug extends Type{

    public TypeBug(){
        name = "Bug";
        typeAdvantages = new String[][]{{new TypeGrass().getName(), new TypeDark().getName()}, {new TypeGrass().getName()}};
    }

}