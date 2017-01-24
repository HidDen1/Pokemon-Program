package game;

import shop.Shop;
import shop.ShopMart;

import java.util.Scanner;

public class Options{

    public int optionsMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do? (Enter number to select option)");
        System.out.println("1. Go Exploring");
        System.out.println("2. Check Party Pokemon");
        System.out.println("3. Trainer Information");
        System.out.println("4. Bag");
        System.out.println("5. Pokedex");
        System.out.println("6. Save");
        System.out.println("-1. Quit");

        return scan.nextInt();


    }

    public void options(int options, Player user){
        switch (options) {
            case 1:
                adventure(user, this);
                options(optionsMenu(), user);
                break;
            case 2:
                user.getPartyPokemon();
                user.viewStats(user);
                options(optionsMenu(), user);
                break;
            case 3:
                user.getAllStats();
                getGoBack();
                break;
            case 4:
                user.getInventory().listItemsOutside();
                options(optionsMenu(), user);
                break;
            case 5:
                System.out.println("This feature is coming soon!");
                options(optionsMenu(), user);
                break;
            case 6:
                System.out.println("This feature is coming soon!");
                options(optionsMenu(), user);
                break;
            case -1:
                System.out.println("Game Over");
                System.exit(0);
                break;

        }
    }

    public void adventure(Player user, Options option){
        int event;
        event = (int) getChance();
        eventOption(event, user, option);
    }

    public double getChance(){
        double chance;
        chance = Math.random() * 100;
        chance = Math.round(chance);

        return chance;
    }

    private void eventOption(int event, Player user, Options option){
        if (event <= 75){
            new Battle().startBattle(user, option);
        } else if (event >= 76 && event <= 100){
            getLocation(user);
        }
    }

    private void getGoBack(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter -1 to go back");
        int one = scan.nextInt();
        if (one == -1){
            optionsMenu();
        }
        while (one != -1){
            System.out.println("Invalid number entered. Please Enter -1 to go back");
            one = scan.nextInt();
            if (one == -1){
                optionsMenu();
            }
        }
    }

    private void getLocation(Player user){
        double l = 1 + Math.random() * (5 - 1);
        int j = (int) l;

        switch (j){
            case 1:
                System.out.println("You found a town!");
                user.getInventory().addRandomItem();
                break;
            case 2:
                System.out.println("You found a forest!");
                user.getInventory().addRandomItem();
                break;
            case 3:
                System.out.println("You found a cave!");
                user.getInventory().addRandomItem();
                break;
            case 4:
                System.out.println("You found a mart!");
                Shop shop = new ShopMart();
                shop.shop(user, this);
                break;
            case 5:
                System.out.println("You found a pokemon center!");
                System.out.println("Your party was fully healed");
                user.healAll();
                System.out.println("Would you like to access the PC? Enter 1 for yes, 2 for no");
                Scanner scan = new Scanner(System.in);
                int pc = scan.nextInt();
                while (pc == 1 || pc == 2){
                    if (pc == 1){

                    } else {

                    }
                }
                break;
            case 6:
                System.out.println("You found a lake!");
                user.getInventory().addRandomItem();
                break;
        }
    }

    public static boolean isNumber(String s){
        try{
            Integer.parseInt(s);
        } catch (NumberFormatException ich){
            return false;
        }
        return true;
    }
}
