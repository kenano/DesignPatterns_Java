package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/28/17.
 */
public interface AtvPartVisitor {
    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);

    void visit(PartsOrder partsOrder);
}
