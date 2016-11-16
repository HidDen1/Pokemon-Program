public abstract class Type {
    private String name;
    private Type[] typeAdvantages, typeDisadvantages;
    static final double TYPE_ADVANTAGE_MULT = 2, TYPE_DISADVANTAGE_MULT = 0.5;

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    void setTypeAdvantages(Type[] tA){
        typeAdvantages = tA;
    }

    void setTypeDisadvantages(Type[] tD){
        typeDisadvantages = tD;
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
