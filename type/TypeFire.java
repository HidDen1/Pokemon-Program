package type;

public class TypeFire extends Type{
    public static final String NAME = "Fire";
    public TypeFire(){
        name = NAME;
        typeAdvantages = new String[][]{{new TypeGrass().getName(), new TypeBug().getName()}, {new TypeBug().getName(), this.getName(), new TypeGrass().getName()}};
    }
}
