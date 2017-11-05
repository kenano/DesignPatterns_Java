package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/2/17.
 *
 * This is an adapter class. It converts an EmployeeLdap object into an Employee object
 */
public class EmployeeAdapterLdap implements Employee {

    //must store an instance of the class being adapted.
    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    //---- Implement the methods of Employee. -------
    //we are converting EmployeeLdap attributes to conform to the Employee interface.

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + instance.getCn();
    }
}
