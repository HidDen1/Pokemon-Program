package type;

public class TypeWater extends Type{
    static final byte SPOT = 1;
    public TypeWater(){
        name = "Water";
        typeAdvantages = new byte[][]{{TypeFire.SPOT},{TypeFire.SPOT, SPOT}};
    }
}
