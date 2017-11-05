package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/23/17.
 */
public class PrototypeDemo {

    public static void main(String[] args) {

        //create the registry used to store the prototype objects
        Registry registry = new Registry();

        //use the registry to clone and return the object type wanted
        Movie movie = (Movie) registry.createItem(Registry.ITEM_TYPE.MOVIE);
        //set additional properties as needed
        movie.setTitle("Creational Patterns in Java");

        //print out the properties of the object
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem(Registry.ITEM_TYPE.MOVIE);
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());


    }
}
