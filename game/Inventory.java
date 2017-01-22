package game;

import item.Item;
import pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    ArrayList<Item> itemList = new ArrayList<Item>();


    public Inventory() {
    }

    public void addRandomItem(){
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

    public void addNewItem(Item i){
        itemList.add(i);
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

    private int idGenerator(){
        double a;
        int b;

        a = 1 + Math.random() * (6 - 1);
        b = (int) Math.round(a);

        return b;
    }
}
