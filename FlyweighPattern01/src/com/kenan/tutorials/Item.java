package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
