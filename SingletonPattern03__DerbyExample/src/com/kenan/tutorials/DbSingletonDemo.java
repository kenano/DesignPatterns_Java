package com.kenan.tutorials;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kenanozdamar on 4/22/17.
 */
public class DbSingletonDemo {

    //sql statement to be executed
    private static final String SQL_STATEMENT = "CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))";

    public static void main (String arg []) {

        //used to calculate system time performing db operations.
        long timeBefore = 0;
        long timeAfter = 0;

        //get instance of singleton db object.
        DbSingleton dbSingleton = DbSingleton.getInstance();

        timeBefore = System.currentTimeMillis();

        //get instance of the DB connection.
        Connection connection = dbSingleton.getConnection();

        timeAfter = System.currentTimeMillis();

        System.out.println("System time getting connection:" + (timeAfter - timeBefore) + " milliseconds");


        Statement statement;
        try {
            //create, execute sql statement, close connection.
            statement = connection.createStatement();
            int count = statement.executeUpdate(SQL_STATEMENT);
            statement.close();
            System.out.println("Table created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //------------ test how long it takes to get connection a second time. -------------
        timeBefore = System.currentTimeMillis();

        //get instance of the DB connection. Since we already have a connection this second time should be a lot faster!
        connection = dbSingleton.getConnection();

        timeAfter = System.currentTimeMillis();

        System.out.println("System time getting connection a second time:" + (timeAfter - timeBefore) + " milliseconds");
        //--------------------------------------------------------------------------------
    }
}
