package type;

public class TypeGrass extends Type{
    static final byte SPOT = 0;

    public TypeGrass(){
        name = "Grass";
        typeAdvantages = new byte[][]{{TypeWater.SPOT}, {TypeWater.SPOT, SPOT}};
    }
}
