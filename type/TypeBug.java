package type;

public class TypeBug extends Type{
    static final byte SPOT = 3;
    public TypeBug(){
        name = "Bug";
        typeAdvantages = new byte[][]{{TypeGrass.SPOT, TypeDark.SPOT}, {TypeGrass.SPOT}};
    }
}
