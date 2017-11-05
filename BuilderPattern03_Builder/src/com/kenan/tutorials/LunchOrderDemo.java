package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/22/17.
 */
public class LunchOrderDemo {

    public static void main(String args[]) {

        //instantiate the builder, notice the required attributes bread, meat
        LunchOrder.Builder builder = new LunchOrder.Builder("whole wheat", "turkey");
        //now any number of the other attributes can be defined in the builder. (dressing is left out)
        builder.condiments("mayo");

        LunchOrder lunchOrder = builder.build();

        System.out.println("Here is what we have in the sandwitch: "
                + lunchOrder.getBread() + ", "
                + lunchOrder.getCondiments() + ", "
                + lunchOrder.getDressing() + ", "
                + lunchOrder.getMeat());
    }
}
