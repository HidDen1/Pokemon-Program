package item;

import game.Player;

public abstract class Item {
    private String itemName;
    private int value;

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

    public abstract int use(Player user);

    /*public int use(Player user){
        int caught = 0;
        double healthGain;

        switch(itemID){
            case 1:
                System.out.println("Go Pokeball!");
                caught = catchPokemon(1);
                return caught;
            case 2:
                System.out.println("Go Greatball!");
                caught = catchPokemon(1.5);
                return caught;
            case 3:
                System.out.println("Go Ultraball!");
                caught = catchPokemon(2);
                return caught;
            case 4:
                user.party[0].setHealth(user.party[0].getHealth() + 20);
                healthGain = user.healthCheck(20);
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
            case 5:
                user.party[0].setHealth(user.party[0].getHealth() + 50);
                healthGain = user.healthCheck(50);
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
            case 6:
                user.party[0].setHealth(user.party[0].getHealth() + 200);
                healthGain = user.healthCheck(200);
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
        }
        return caught;
    } */


    public String getItemName(){
        return(itemName);
    }
}
