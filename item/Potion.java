package item;

import game.Player;

public abstract class Potion extends Item{
    private double healthRestore;

    public int use(Player user){
        user.getParty()[0].setHealth(user.getParty()[0].getHealth() + healthRestore);
        healthRestore = user.healthCheck(healthRestore);
        System.out.println("You have regained " + healthRestore + " HP.");
        return 0;
    }

    protected void setHealthRestore(double healthRestore){
        this.healthRestore = healthRestore;
    }

}