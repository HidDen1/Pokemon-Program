package game;

import item.Item;
import pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    ArrayList<Item> itemList = new ArrayList<Item>();
    public int currentSlot = 0, empty = 1;


    public Inventory() {
    }

    public void addNewItem(){
        if (currentSlot < 60) {
            empty = -1;
            //Item item = new Item();
            //itemID = idGenerator();
            //item.itemNew(itemID); TODO GET A NEW ITEM GENERATOR
            //System.out.println("You found a " + item.getItemName());
            //int space;
            //space = itemList.size();
            //itemList.add(space, item);
        } else {
            System.out.println("Bag is full");
        }
    }

    public void useItem(Player user, Battle bat, Pokemon wild, Options option){ //need methods during and not during battle
        Scanner scan = new Scanner(System.in);
        int position = 0;
        int caught;
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
                    bat.playerAttackPhase(user, wild, option);
                    break;
                case -2:
                    System.out.println("Enter the item number, not the item name!");
                    break;
                default:
                    position--;
                    try{
                        caught = itemList.get(position).use(user); //something around here is broken
                    } catch (IndexOutOfBoundsException blarg){
                        System.out.println("No item in that slot");
                        break;
                    }
                    itemList.remove(position);
                    position = -1;
                    if (caught == 1){
                        System.out.println("The wild " + wild.getName() + " was caught!");
                        int id = user.party.length + 1;
                        if (id < 6 && id >= 0){
                            user.party[id] = wild;
                        } else {
                            System.out.println("You party is full so " + wild.getName() + " was sent to the PC");
                        }
                        user.party[id].setLevel(wild.getLevel());
                        user.party[id].setExperience(0);
                        user.storage[id] = wild;
                        //PC.addPokemon(wild);
                        bat.wildLose(wild, user, option);
                        break;
                    } else if (caught == -1) {
                        System.out.println(wild.getName() + " escaped the ball!");
                        bat.wildAttackPhase(user, wild, option);
                    } else {
                        bat.wildAttackPhase(user, wild, option);
                    }
            }
        }
        bat.wildAttackPhase(user, wild, option);
    }

    public void listItemsOutside(){
        int back = 0;
        Scanner scan = new Scanner(System.in);
        listItems();
        while (back != -1){
        System.out.println("Enter -1 to go back");
        back = scan.nextInt();
        }
    }

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
    }

    public void shop(Player user){
        String choiceString;
        int choice = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the mart, " + user.getName());
        while(choice != -1){
            System.out.println("What would you like to buy? \n 1. Pokeball (200 RiskyLunges) \n 2. Greatball (500 Pokedollars) \n 3. Ultraball (1500 Pokedollars) \n 4. Potion (100 Pokedollars) \n 5. Super Potion (300 Pokedollars) \n 6. Hyper Potion (1000 Pokedollars) \n-1. Leave the Risky Lunge shop");
            System.out.println("You have: " + user.getPokedollars());
            choiceString = input.nextLine();
            try{
                choice = Integer.parseInt(choiceString);
            } catch (NumberFormatException idk){
                choice = 0;
            }
            if (user.getPokedollars() >= Item.itemList()[choice].getValue()){
                user.spendPokedollars(Item.itemList()[choice].getValue());
                System.out.println("You got a " + Item.itemList()[choice].getItemName() + "!");
                addNewItemShop(choice);
            } else {
                System.out.println("Not enough Pokedollars for that.");
            }
        }
    }

    public void addNewItemShop(int choice){
        empty = -1;
        //Item item = new Item();
        //item.itemNew(choice);
        //int space; TODO FIX THIS TOO
        //space = itemList.size();
        //itemList.add(space, item);
    }

    private int idGenerator(){
        double a;
        int b;

        a = 1 + Math.random() * (6 - 1);
        b = (int) Math.round(a);

        return b;
    }
}
