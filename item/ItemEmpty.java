package item;

import game.Player;

public class ItemEmpty extends Item{
    public ItemEmpty(){
        setItemName("Error");
        setValue(1000000000);
    }

    public int use(Player user){
        return 0;
    }
}
