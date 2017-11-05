package com.kenan.tutorials;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by kenanozdamar on 5/3/17.
 */
public class JdbcFacade {

    DbSingleton dbinstance = null;

    public JdbcFacade() {
        this.dbinstance = DbSingleton.getInstance();
    }

    public int createTable(){
        int count = 0;
        try {
            Connection conn = dbinstance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some street', 'Layton')");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable(){
        int count = 0;
        try {
            Connection conn = dbinstance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some street', 'Layton')");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses(){
        List<Address> addresses = new ArrayList<>();

        try {
            Connection conn = dbinstance.getConnection();
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                Address address = new Address();
                address.setId(rs.getString(1));
                address.setStreetName(rs.getString(2));
                address.setCity(rs.getString(3));

                addresses.add(address);
            }

            rs.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addresses;
    }
}
