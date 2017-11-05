package com.kenan.tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kenanozdamar on 5/28/17.
 */
public class PartsOrder implements AtvPart {

    private List<AtvPart> atvParts = new ArrayList<>();

    public void addPart(AtvPart atvPart){
        atvParts.add(atvPart);
    }

    public List<AtvPart> getAtvParts() {
        return Collections.unmodifiableList(atvParts);
    }

    @Override
    public void accept(AtvPartVisitor vistor) {
        for (AtvPart atvPart : atvParts){
            atvPart.accept(vistor);
        }
        vistor.visit(this);
    }
}
