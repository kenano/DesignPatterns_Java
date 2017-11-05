package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
