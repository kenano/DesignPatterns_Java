package com.kenan.tutorials.nobridge;

public class Shape1BridgeDemo {

    public static void main(String[] args) {

        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        // creating new classes for each shape/color is bad design. We have to create a class for each color of a shape
        //we want. If we want a green circle we have to create a new class just that specific shape/color combination.
        //for additional shapes well have to create a new class for every color of that shape we want.
        // this is simply too many classes that need to be created.
        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
