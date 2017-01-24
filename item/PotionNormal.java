package item;

public class PotionNormal extends Potion{
    public static final byte ID = 4;
    public PotionNormal(){
        setItemName("Potion");
        setValue(100);
        setHealthRestore(20);
    }
}