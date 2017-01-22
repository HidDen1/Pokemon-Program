package item;

public class PotionHyper extends Potion{
    public static byte ID = 6;
    public PotionHyper(){
        setItemName("Hyper Potion");
        setValue(1000);
        setHealthRestore(200);
    }
}
