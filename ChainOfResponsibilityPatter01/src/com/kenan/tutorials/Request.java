package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class Request {
    private RequestType requestType;
    private double amount;

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }

    public Request(RequestType requestType, double amount) {

        this.requestType = requestType;
        this.amount = amount;
    }
}
