package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class TwitterDemo {

    public static void main(String[] args){
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline("bh5k"));
    }
}
