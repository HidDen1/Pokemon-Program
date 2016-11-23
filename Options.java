import java.util.Scanner;

public class Options{

    public void optionsMenu(Player user, Options option, Inventory inventory, Battle bat){
        int options;
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do? (Enter number to select option)");
        System.out.println("1. Go Exploring");
        System.out.println("2. Check Party Pokemon");
        System.out.println("3. Trainer Information");
        System.out.println("4. Bag");
        System.out.println("5. Pokedex");
        System.out.println("6. Save");
        System.out.println("-1. Quit");

        options = scan.nextInt();

        options(options, user, option, inventory, bat);
    }

    private void options(int options, Player user, Options option, Inventory inventory, Battle bat){
        switch (options) {
            case 1:
                adventure(user, option, inventory, bat);
                optionsMenu(user, option, inventory, bat);
                break;
            case 2:
                user.getPartyPokemon();
                getGoBack(user, option, inventory, bat);
                break;
            case 3:
                user.getAllStats();
                getGoBack(user, option, inventory, bat);
                break;
            case 4:
                inventory.listItemsOutside(option, user, inventory, bat);
                optionsMenu(user, option, inventory, bat);
                break;
            case 5:
                System.out.println("This feature is coming soon!");
                optionsMenu(user, option, inventory, bat);
                break;
            case 6:
                System.out.println("This feature is coming soon!");
                optionsMenu(user, option, inventory, bat);
                break;
            case -1:
                System.out.println("Game Over");
                System.exit(0);
                break;

        }
    }

    public void adventure(Player user, Options option, Inventory inventory, Battle bat){
        int event;
        event = (int) getChance();
        eventOption(event, user, option, inventory, bat);
    }

    public double getChance(){
        double chance;
        chance = Math.random() * 100;
        chance = Math.round(chance);

        return chance;
    }

    private void eventOption(int event, Player user, Options option, Inventory inventory, Battle bat){
        if (event <= 75){
            bat.startBattle(user, option, inventory, bat);
        } else if (event >= 76 && event <= 100){
            getLocation(user, inventory);
        }
    }

    private void getGoBack(Player user, Options option, Inventory inventory, Battle bat){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter -1 to go back");
        int one = scan.nextInt();
        if (one == -1){
            optionsMenu(user, option, inventory, bat);
        }
        while (one != -1){
            System.out.println("Invalid number entered. Please Enter -1 to go back");
            one = scan.nextInt();
            if (one == -1){
                optionsMenu(user, option, inventory, bat);
            }
        }
    }

    private void getLocation(Player user, Inventory inventory){
        double l = 1 + Math.random() * (5 - 1);
        int j = (int) l;

        switch (j){
            case 1:
                System.out.println("You found a town!");
                inventory.addNewItem();
                break;
            case 2:
                System.out.println("You found a forest!");
                inventory.addNewItem();
                break;
            case 3:
                System.out.println("You found a cave!");
                inventory.addNewItem();
                break;
            case 4:
                System.out.println("You found a mart!");
                inventory.shop(user);
                break;
            case 5:
                System.out.println("You found a pokemon center!");
                System.out.println("Your party was fully healed");
                user.healAll();
                break;
            case 6:
                System.out.println("You found a lake!");
                inventory.addNewItem();
                break;
        }
    }
}
