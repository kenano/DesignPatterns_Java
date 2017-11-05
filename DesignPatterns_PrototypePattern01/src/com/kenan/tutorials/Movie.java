package com.kenan.tutorials;

/**
 * Creates an Book object which is of type Item. Adds additional properties to Item.
 */
public class Movie extends Item {
    private String runtime;

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
