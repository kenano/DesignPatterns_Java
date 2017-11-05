package com.kenan.tutorials;

/**
 * Creates an Book object which is of type Item. Adds additional properties to Item.
 */
public class Book extends Item {
    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
