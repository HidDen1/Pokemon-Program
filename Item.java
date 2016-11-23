import java.util.ArrayList;

public class Item extends Stats{

    public void itemNew(int a){
        itemID = a;
        switch(itemID){
            case 1:
                itemName = "Pokeball";
                //ballBonus = 1;
                itemID = 1;
                break;
            case 2:
                itemName = "Greatball";
                //ballBonus = 1.5;
                itemID = 2;
                break;
            case 3:
                itemName = "Ultraball";
                //ballBonus = 2;
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

    public int use(Player user){
        int caught = 0;
        double healthGain;

        switch(itemID){
            case 1:
                System.out.println("Go Pokeball!");
                ballBonus = 1;
                caught = catchPokemon(ballBonus);
                return caught;
            case 2:
                System.out.println("Go Greatball!");
                ballBonus = 1.5;
                caught = catchPokemon(ballBonus);
                return caught;
            case 3:
                System.out.println("Go Ultraball!");
                ballBonus = 2;
                caught = catchPokemon(ballBonus);
                return caught;
            case 4:
                user.remainingHealth [0] = user.remainingHealth[0] + 20;
                healthGain = user.healthCheck();
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
            case 5:
                user.remainingHealth [0] = user.remainingHealth[0] + 50;
                healthGain = user.healthCheck2();
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
            case 6:
                user.remainingHealth [0] = user.remainingHealth[0] + 200;
                healthGain = user.healthCheck3();
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
        }
        return caught;
    }

    private int catchPokemon(double ballBonus){
        double rand = 1 + Math.random() * (50 - 1);
        double catched = rand * ballBonus;
        int caught;
        if (catched > 50){
            caught = 1;
        } else {
            caught = -1;
        }
        return caught;
    }

    public String getItemName(){
        return(itemName);
    }
}
