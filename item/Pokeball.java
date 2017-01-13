package item;

import game.Player;

public abstract class Pokeball extends Item{

    private int ballBonus;

    public int use(Player user){
        return catchPokemon(ballBonus);
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

    public int getBallBonus() {
        return ballBonus;
    }

    public void setBallBonus(int ballBonus) {
        this.ballBonus = ballBonus;
    }
}