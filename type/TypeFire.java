package type;

public class TypeFire extends Type{
    static final byte SPOT = 2;
    public TypeFire(){
        name = "Fire";
        typeAdvantages = new byte[][]{{TypeGrass.SPOT, TypeBug.SPOT},{TypeGrass.SPOT, SPOT, TypeBug.SPOT}};
    }
}
