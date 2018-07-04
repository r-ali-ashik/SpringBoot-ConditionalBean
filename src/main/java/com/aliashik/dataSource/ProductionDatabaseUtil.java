package com.aliashik.dataSource;

import com.aliashik.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ProductionDatabaseUtil implements DataSource {

    @Override
    public List<Employee> getEmployeeDetails(){
        System.out.println("::::::::::: getting data from prod data source :::::::::::::::::: ");
        List<Employee> empDetails = new ArrayList<>();
        Employee emp1 = new Employee(1,"Ramu",45000.0);
        Employee emp2 = new Employee(9002,"Charan",35000.0);
        Employee emp3 = new Employee(9003,"Joe",55000.0);
        empDetails.add(emp1);
        empDetails.add(emp2);
        empDetails.add(emp3);

        return empDetails;
    }
}