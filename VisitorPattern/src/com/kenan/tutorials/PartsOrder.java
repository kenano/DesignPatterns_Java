package com.kenan.tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kenanozdamar on 5/28/17.
 */
public class PartsOrder implements AtvPart {
    private List<AtvPart> atvParts = new ArrayList<>();

    public void addAtvPart(AtvPart atvPart){
        atvParts.add(atvPart);
    }

    public List<AtvPart> getAtvParts() {
        return Collections.unmodifiableList(atvParts);
    }

    public void calculateShipping(){
        for (AtvPart part : atvParts){

            //in the implementations of AtvPart this has not exist. That means to had this method to the
            //AtvPart interface we have to change every class which is an AtvPart. (And this class as well since it
            //also implements AtvPart. If we have many AtvPart classes this would be a nightmare to do.
//            part.calculateShipping();
        }
    }
}
