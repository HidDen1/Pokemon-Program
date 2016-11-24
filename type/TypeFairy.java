package type;

public class TypeFairy extends Type{
    static final byte SPOT = 17;

    public TypeFairy(){
        name = "Fairy";
        typeAdvantages = new byte[][]{{TypeDark.SPOT, TypeFighting.SPOT, TypeDragon.SPOT},{TypeBug.SPOT, TypeDark.SPOT, TypeFighting.SPOT}};
    }

}