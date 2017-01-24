package shop;

import item.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopMart extends Shop {
    public ShopMart(){
        setShopName("PokeMart");
        ArrayList<Item> i = new ArrayList<>(Arrays.asList(Item.itemList()));
        i.remove(0);
        setShopList(i); //You will have to change this with new additions later
    }
}
