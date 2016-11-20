package type;

public class TypeGrass extends Type {

    public TypeGrass(){
        name = "Grass";
        typeAdvantages = new Type[]{new TypeWater()};
    }
}
