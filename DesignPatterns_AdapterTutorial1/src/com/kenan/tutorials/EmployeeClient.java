package com.kenan.tutorials;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenanozdamar on 4/2/17.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        //1. Create a collections of  Employee objects.
        List<Employee> employees = new ArrayList<>();

        //Since EmployeeDB implements Employee you can add it to List<Employee> but what if we want to add an object
        //that doesnt implement Employee
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);

        //2. this cant be added to employee since EmployeeLdap doesnt implement Employee
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));


        return employees;
    }
}
