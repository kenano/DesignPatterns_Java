package com.kenan.tutorials.withbridge;

/**
 * Created by kenanozdamar on 4/7/17.
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();1
}
