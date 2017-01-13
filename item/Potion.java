package item;

import game.Player;

public abstract class Potion extends Item{
    double healthRestore;

    public int use(Player user){
        user.getParty()[0].setHealth(user.getParty()[0].getHealth() + healthRestore);
        healthRestore = user.healthCheck(healthRestore);
        System.out.println("You have regained " + healthRestore + " HP.");
        return 0;
    }

}