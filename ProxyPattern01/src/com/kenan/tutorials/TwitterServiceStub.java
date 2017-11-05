package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {

        return "My timeline  ";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
