package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public interface TwitterService  {

    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);

}
