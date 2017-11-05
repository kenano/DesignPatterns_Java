package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/23/17.
 */
public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());

    }
}
