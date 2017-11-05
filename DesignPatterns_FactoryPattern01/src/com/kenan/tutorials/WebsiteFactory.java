package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/23/17.
 */
public class WebsiteFactory  {
    enum WebsiteType {BLOG, SHOP}

    public static Website getWebsite(WebsiteType websiteType){
        switch (websiteType){
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
