package com.kenan.tutorials;

//singletons should be thread safe. What if mutliple threads invoke getInstance() at the same time?
public class DbSingleton {

    //lazy load instance should be initialized to null
    private static DbSingleton instance = null;

    //make the constructor private so other classes can't instantiate the singleton directly.
    private DbSingleton(){}

    public static DbSingleton getInstance() {

        //lazy load. If instance exists load it, if not create it.
        //since this code is synchronized, it's best to do an initial instance exists check before checking for lock.
        //this way only time synchronized code is run is the the first time object is created. The entire reason for
        //synchronization is to make sure multiple threads are not creating singleton at the same time.
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }

        }
        return instance;
    }
}
