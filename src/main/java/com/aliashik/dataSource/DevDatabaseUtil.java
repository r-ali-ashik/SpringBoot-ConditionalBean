package com.aliashik.dataSource;


import com.aliashik.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DevDatabaseUtil implements DataSource {

    @Override
    public List<Employee> getEmployeeDetails(){
        System.out.println("::::::::::: getting data from dev data source :::::::::::::::::: ");
        List<Employee> empDetails = new ArrayList<>();
        Employee emp1 = new Employee(111,"Abc",11000.0);
        Employee emp2 = new Employee(222,"Xyz",22000.0);
        empDetails.add(emp1);
        empDetails.add(emp2);

        return empDetails;
    }
}