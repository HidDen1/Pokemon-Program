package shop;

import game.Player;
import item.Item;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Shop {
    private ArrayList<Item> shopList = new ArrayList<>();
    private String shopName;

    public void shop(Player user){
        String choiceString;
        int choice = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the " + shopName + ", " + user.getName());
        while(choice != -1){
            System.out.println("What would you like to buy? " + "You have: " + user.getPokedollars());
            byte num = 1;
            for(Item i : shopList){
                System.out.println(num + ". " + i.getItemName() + " (" + i.getValue() + " Pokedollars)");
            }
            System.out.println("-1. Leave the Risky Lunge shop");
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
                user.getInventory().addNewItem(shopList.get(choice - 1));
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
}
