package com.kenan.tutorials;

import java.util.List;

/**
 * Created by kenanozdamar on 5/3/17.
 */
public class FacadeJdbcDemo {
    public static void main (String args []) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address : addresses) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
        }
    }
}
