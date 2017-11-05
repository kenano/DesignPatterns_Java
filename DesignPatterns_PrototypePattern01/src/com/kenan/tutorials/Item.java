package com.kenan.tutorials;

//this class is not concrete. This means that another class will have to extend it before it can be instantiate.
public abstract class Item implements Cloneable{

    private String title;
    private double price;
    private String url;

    //Since this class implements cloneable the classes that extend this (into a concrete class) will not need to
    //implement cloneable. In fact this Override will allow the subclasses to clone as they need.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //define getters/setters for every item type. Classes that extend this will add there own getters/setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
