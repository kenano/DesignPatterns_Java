package com.kenan.tutorials;

/**
 * Demonstrates how an object is build using setters. Notice the empty constructor. This is is part of the Bean pattern.
 *
 *  Problems with design:
 *      Not immutable.
 *      Not contract on what is necessary and optional in the order.
 */
public class LunchOrder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrder() {}

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
    public void setBread(String bread) {
        this.bread = bread;
    }
    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }
    public void setDressing(String dressing) {
        this.dressing = dressing;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }
}
