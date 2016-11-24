package type;

public class TypePoison extends Type{
    final static byte SPOT = 8;

    public TypePoison(){
        name = "Poison";
        typeAdvantages = new byte[][]{{TypeGrass.SPOT},{SPOT, TypeBug.SPOT, TypeGrass.SPOT}};
    }

}
