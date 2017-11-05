package com.kenan.tutorials;

/**
 * This example uses telescoping constructors. Notice each constructor uses a previously defined constructor as a
 * parameter.
 *
 * A feature of this design:
 *  No setters. the Objects are immutable
 *
 * Some problems with this design:
 *  What if we want no bread, or no condiments.
 *
 */
public class LunchOrder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrder (String bread) {
        this.bread = bread;
    }

    public LunchOrder (String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrder (String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrder (String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
