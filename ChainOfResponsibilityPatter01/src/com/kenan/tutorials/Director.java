package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("Directors can approve conferences");
        }else {
            successor.handleRequest(request);
        }
    }
}
