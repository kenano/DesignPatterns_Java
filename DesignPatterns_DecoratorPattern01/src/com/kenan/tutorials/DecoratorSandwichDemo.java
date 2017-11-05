package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/2/17.
 */
public class DecoratorSandwichDemo {
    public static void main(String[] args){
         Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

         System.out.println("Here is the sandwich" + sandwich.make());
    }
}
