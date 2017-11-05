package com.kenan.tutorials;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<>();


    //factory method
    public Item lookup(String itemName){
        if (!items.containsKey(itemName)){
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade(){
        return items.size();
    }
}
