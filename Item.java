import java.util.ArrayList;

public class Item extends Stats{

    public void itemNew(){
        itemID = idGenerator();
        switch(itemID){
            case 1:
                itemName = "Pokeball";
                ballBonus = 1;
                itemID = 1;
                break;
            case 2:
                itemName = "Greatball";
                ballBonus = 1.5;
                itemID = 2;
                break;
            case 3:
                itemName = "Ultraball";
                ballBonus = 2;
                itemID = 3;
                break;
            case 4:
                itemName = "Potion";
                //healthRestore = 20;
                itemID = 4;
                break;
            case 5:
                itemName = "Super Potion";
                //healthRestore = 50;
                itemID = 5;
                break;
            case 6:
                itemName = "Hyper Potion";
                //healthRestore = 200;
                itemID = 6;
                break;
        }
    }

    public void use(Player user){
        double healthGain;

        switch(itemID){
            case 1:
                System.out.println("Go Pokeball!");
                break;
            case 2:
                System.out.println("Go Greatball!");
                break;
            case 3:
                System.out.println("Go Ultraball!");
                break;
            case 4:
                user.remainingHealth [0] = user.remainingHealth[0] + 20;
                healthGain = user.healthCheck();
                System.out.println("You have regained " + healthGain + " battle points.");
                break;
            case 5:
                user.remainingHealth [0] = user.remainingHealth[0] + 50;
                healthGain = user.healthCheck2();
                System.out.println("You have regained " + healthGain + " battle points.");
                break;
            case 6:
                user.remainingHealth [0] = user.remainingHealth[0] + 200;
                healthGain = user.healthCheck3();
                break;
        }
    }

    private int idGenerator(){
        double a;
        int b;

        a = 1 + Math.random() * (6 - 1);
        b = (int) Math.round(a);

        return b;
    }

    public String getItemName(){
        return(itemName);
    }
}
