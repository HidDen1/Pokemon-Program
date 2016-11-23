package type;

public class TypeDark extends Type{
    static final byte SPOT = 5;
    public TypeDark(){
        name = "Dark";
        typeAdvantages = new byte[][]{{},{SPOT}};
    }
}
