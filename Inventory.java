import java.util.ArrayList;
import java.util.Scanner;

public class Inventory extends Item {
    ArrayList<Item> itemList = new ArrayList<Item>();
    public int currentSlot = 0, empty = 1;


    public Inventory() {
    }

    public void addNewItem(){
        if (currentSlot < 60) {
            empty = -1;
            Item item = new Item();
            item.itemNew();
            System.out.println("You found a " + item.getItemName());
            int space;
            space = itemList.size();
            itemList.add(space, item);
        } else {
            System.out.println("Bag is full");
        }
    }



    //@SuppressWarnings("resource")
    public void useItem(Player user, Battle bat, Pokemon wild, Options option, Pokemon battling, Inventory inventory){ //need methods during and not during battle
        Scanner scan = new Scanner(System.in);
        int position = 0;
        if (itemList.size() == 0){
            System.out.println("No items in Inventory");
            position = -1;
        }
        while(position != -1){
            System.out.println("What item do you want to use?");
            listItems();
            System.out.println("Enter -1 to go back");
            position = scan.nextInt();
            switch(position){
                case -1:
                    bat.playerAttackPhase(user, wild, option, battling, inventory, bat);
                    break;
                case -2:
                    System.out.println("Enter the item number, not the item name!");
                    break;
                default:
                    position--;
                    try{
                        itemList.get(position).use(user); //something around here is broken
                    } catch (IndexOutOfBoundsException blarg){
                        System.out.println("No item in that slot");
                        break;
                    }
                    itemList.remove(position);
                    position = -1;
                    bat.wildAttackPhase(user, wild, option, battling, inventory, bat);
            }
        }
    }

    //public String getItemName(int placement){
        //return(itemList.get(placement).getName());
    //}

    public void listItems(){
        int size;
        if (itemList.size() == 0){
            empty = 1;
        }
        size = itemList.size() - 1;
        if (empty == 1){
            System.out.println("The Bag is empty");
            }
        for(int i = 0; i <= size; i++){
            System.out.println(i + 1 + ". " + itemList.get(i).getItemName());
        }
        //go back method

    }

    /*@SuppressWarnings("resource")
    public void shop(Player user){
        String choiceString;
        int choice = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Risky Lunge shop, " + user.getName());
        while(choice != -1){
            System.out.println("What would you like to Risky Lunge? \n 0. Check Risky Lunge amount \n 1. Risky Lunge Health Potion (15 Gold) \n-1. Leave the Risky Lunge shop");
            choiceString = input.nextLine();
            try{
                choice = Integer.parseInt(choiceString);
            } catch (NumberFormatException idk){
                choice = -2;
            }
            switch(choice){
                case 0:
                    System.out.println("You have " + user.getGold() + " Risky Lunge.");
                    break;
                case 1:
                    if (user.getGold() >= 15){
                        user.spendGold(15);
                        System.out.println("You got a Risky Lunge health potion!");
                        addNewItem(choice);
                    }
                    break;
                case -1:
                    System.out.println("Come Risky Lunge again soon!");
                    break;
                default:
                    System.out.println("Enter an applicable Risky Lunge.");
            }
        }
    }
}*/
}