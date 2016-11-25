package type;

import java.util.ArrayList;

public abstract class Type {
    protected String name;
    //0 = offense, 1 = defense
    protected byte[][] typeAdvantages;
    protected byte[] typeNulls;
    static final double TYPE_ADVANTAGE_MULT = 2, TYPE_DISADVANTAGE_MULT = 0.5;

    String getName(){
        return name;
    }

    /**
     * @return Array that holds ALL the types in the game. SPOT variable & bytes reference location in this array
     */
    public static Type[] getTypes(){
        return new Type[]{new TypeGrass(), new TypeWater(), new TypeFire(), new TypeBug(), new TypeDragon(), new TypeDark(), new TypeNormal(), new TypeFlying(), new TypePoison(), new TypeIce(), new TypePsychic(), new TypeSteel(), new TypeFighting(),
        new TypeGhost(), new TypeGround(), new TypeRock(), new TypeElectric(), new TypeFairy()};
    }

    /**
     * @return Array that holds any type that this type is advantageous when fighting against it
     */
    Type[] getTypeAdvantagesOffensive(){
        ArrayList<Type> hold = new ArrayList<>();
        for(byte i : typeAdvantages[0]){
            hold.add(getTypes()[i]);
        }
        return hold.toArray(new Type[hold.size()]);
    }

    /**
     * @return Number of types this type is advantageous against when fighting it
     */
    int getTypeAdvantageOffensiveNum(){
        return typeAdvantages[0].length;
    }

    /**
     * @return Array that holds any type that this type is advantageous when defending from it
     */
    Type[] getTypeAdvantagesDefensive(){
        ArrayList<Type> hold = new ArrayList<>();
        for(byte i : typeAdvantages[1]){
            hold.add(getTypes()[i]);
        }
        return hold.toArray(new Type[hold.size()]);
    }

    /**
     * @return The number of types this type  is advantageous against when defending from it
     */
    int getTypeAdvantageDefensiveNum(){
        return typeAdvantages[1].length;
    }

    /**
     * @return Array that holds the types this type cannot harm
     */
    Type[] getTypeNulls(){
        ArrayList<Type> hold = new ArrayList<>();
        for(byte i : typeNulls){
            hold.add(getTypes()[i]);
        }
        return hold.toArray(new Type[hold.size()]);
    }

    /**
     * @return Number of types this type cannot harm
     */
    int getTypeNullsNum(){
        return typeNulls.length;
    }

}