package com.kenan.tutorials;

/**
 * Create a lunch object using a builder.
 *
 * Advantages of using a builder:
 *  There is no explicit set of constructors controlling how we create the object.
 *
 *  The builder will force the contract of required attributes as allow any combination of optional attributes to be
 *      defined in object being created.
 *
 *  We can force the object we create to be immutable.
 */
public class LunchOrder {

    //we want these values to be immutable so set to final.
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;


    //LunchOrder is created with a private constructor so only the Builder will create instances of this object.
    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    //***notice that there are no setters as the object is immutable.***

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

    // this class creates the LunchOrder objects for us. It allows us to define a contract on which attributes are
    //required and it can create the object with any combination of optional attributes.
    public static class Builder {

        //define the attributes a LunchOrder can have.
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        //Builder's constructor should have the required attributes (since there will be only once constructor for
        //builder it will be forced to provide it.)
        public Builder(String bread, String meat){
            this.bread = bread;
            this.meat = meat;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public LunchOrder build() {
            if (bread == null || bread.isEmpty() || meat == null || meat.isEmpty()) return null;

            return new LunchOrder(this);
        }
    }
}
