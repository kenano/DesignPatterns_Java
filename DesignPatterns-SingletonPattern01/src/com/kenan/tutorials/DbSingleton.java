package com.kenan.tutorials;

public class DbSingleton {

    //eager way of creating the singleton. class is instantiated at runtime since it's static
//    private static DbSingleton instance  = new DbSingleton();

    //lazy load instance should be initialized to null
    private static DbSingleton instance = null;

    //make the constructor private so other classes can't instantiate the singleton directly.
    private DbSingleton(){}

    public static DbSingleton getInstance(){

        //lazy load. If instance exists load it, if not create it.
        if(instance == null){
            instance = new DbSingleton();
        }
        return instance;
    }

}
