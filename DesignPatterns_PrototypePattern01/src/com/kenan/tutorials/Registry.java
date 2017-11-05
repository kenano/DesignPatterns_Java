package com.kenan.tutorials;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kenanozdamar on 4/23/17.
 */
public class Registry  {

    //define the different types of items the registry is storing
    public static enum ITEM_TYPE {MOVIE, BOOK}

    //instantiate the registry. it will store the prototype objects from which will will clone
    private Map<ITEM_TYPE, Item> itemsRegistry = new HashMap<ITEM_TYPE, Item>();

    //constructor creates the registry used to clone objects.
    public Registry() {
        loadItems();
    }

    //to create an item we retrieve the prototype object of the type of object we want to clone from a registry.
    //the clone and return it.
    public Item createItem(ITEM_TYPE type){
        Item item = null;
        try{
            item = (Item)(itemsRegistry.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    //creates a registry of "default" objects from which we will clone
    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        itemsRegistry.put(ITEM_TYPE.MOVIE, movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        itemsRegistry.put(ITEM_TYPE.BOOK, book);
    }
}
