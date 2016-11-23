package type;

public abstract class Type {
    //TODO CHRIST FIX THE GODDAMN NAMES
    protected String name;
    //0 = offense, 1 = defense
    protected String[][] typeAdvantages;
    protected String[] typeNulls;
    static final double TYPE_ADVANTAGE_MULT = 2, TYPE_DISADVANTAGE_MULT = 0.5;

    String getName(){
        return name;
    }

    public String getTypeAdvantageOffensive(int num){
        return typeAdvantages[0][num];
    }

    String[] getTypeAdvantagesOffensive(){
        return typeAdvantages[0];
    }

    int getTypeAdvantageOffensiveNum(){
        return typeAdvantages[0].length;
    }

    public String getTypeAdvantagesDefensive(int num){
        return typeAdvantages[1][num];
    }

    String[] getTypeAdvantagesDefensive(){
        return typeAdvantages[1];
    }

    int getTypeAdvantageDefensiveNum(){
        return typeAdvantages[1].length;
    }


}