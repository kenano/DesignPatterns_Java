package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/22/17.
 */
public class DbSingletonDemo {

    public static void main(String[] args) {

        //this line produces error since constructor has private access.
//        DbSingleton instance_one = new DbSingleton();
//
        // refs to DbSingle will print same object address.
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        DbSingleton instance2 = DbSingleton.getInstance();
        System.out.println(instance2);

    }
}
