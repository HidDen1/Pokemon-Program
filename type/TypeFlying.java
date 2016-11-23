package type;

public class TypeFlying extends Type{
    static final byte SPOT = 7;
    public TypeFlying(){
        name = "Flying";
        typeAdvantages = new byte[][]{{TypeBug.SPOT, TypeGrass.SPOT},{TypeBug.SPOT, TypeGrass.SPOT}};
    }
}
