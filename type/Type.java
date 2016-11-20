package type;

public abstract class Type {
    protected String name;
    protected Type[] typeAdvantages, typeDisadvantages;
    static final double TYPE_ADVANTAGE_MULT = 2, TYPE_DISADVANTAGE_MULT = 0.5;

    String getName(){
        return name;
    }

    Type getTypeAdvantage(int num){
        return typeAdvantages[num];
    }

    Type[] getTypeAdvantages(){
        return typeAdvantages ;
    }

    int getTypeAdvantageNum(){
        return typeAdvantages.length;
    }

    Type getTypeDisadvantage(int num){
        return typeDisadvantages[num];
    }

    Type[] getTypeDisadvantages(){
        return typeDisadvantages;
    }

    int getTypeDisadvantageNum(){
        return typeDisadvantages.length;
    }


}
