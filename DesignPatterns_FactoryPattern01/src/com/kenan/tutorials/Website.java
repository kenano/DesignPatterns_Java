package com.kenan.tutorials;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenanozdamar on 4/23/17.
 */
public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    //all concrete classes that implement this abstact class will override this method.
    public abstract void createWebsite();
}
