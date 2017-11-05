package com.kenan.tutorials.withbridge;

/**
 * Created by kenanozdamar on 4/7/17.
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
