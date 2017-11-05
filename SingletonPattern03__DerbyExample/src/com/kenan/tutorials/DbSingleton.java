package com.kenan.tutorials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static DbSingleton instance = null;
    private Connection connection;
    static final private String DBURL = "jdbc:derby:memory:codejava/webdb;create=true";

    //make the constructor private so other classes can't instantiate the singleton directly.
    private DbSingleton(){
        try {
            //Register a driver with a db manager (java.sql method)
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //lazy load. If instance exists load it, if not create it.
    //since this code is synchronized, it's best to do an initial instance exists check before checking for lock.
    //this way only time synchronized code is run is the the first time object is created. The entire reason for
    //synchronization is to make sure multiple threads are not creating singleton at the same time.
    public static DbSingleton getInstance(){
        if (instance != null) return instance;

        synchronized (DbSingleton.class) {
            if (instance == null) {
                instance = new DbSingleton();
            }
        }
        return instance;
    }

    public Connection getConnection(){
        //if a connection instance already exists just return it.
        if (this.connection != null) return connection;

        // if we're getting a new connection instance we dont want another thread attempting to do the same.
        synchronized (DbSingleton.class) {
            if (connection == null) {
                try {
                   connection = DriverManager.getConnection(DBURL);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return connection;
    }
}