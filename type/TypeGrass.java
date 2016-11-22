package type;

public class TypeGrass extends Type {

    public TypeGrass(){
        name = "Grass";
        typeAdvantages = new String[][]{{new TypeWater().getName()}, {this.getName(), new TypeWater().getName()}};
    }
}
