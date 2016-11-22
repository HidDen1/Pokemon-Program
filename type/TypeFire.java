package type;

public class TypeFire extends Type{
    public TypeFire(){
        name = "Fire";
        typeAdvantages = new String[][]{{new TypeGrass().getName(), new TypeBug().getName()}, {new TypeBug().getName(), this.getName(), new TypeGrass().getName()}};
    }
}
