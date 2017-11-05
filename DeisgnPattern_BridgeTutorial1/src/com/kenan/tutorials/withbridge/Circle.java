package com.kenan.tutorials.withbridge;

/**
 * Created by kenanozdamar on 4/7/17.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
