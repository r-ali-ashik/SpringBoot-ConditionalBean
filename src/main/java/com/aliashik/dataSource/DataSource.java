package com.aliashik.dataSource;

import com.aliashik.model.Employee;

import java.util.List;

public interface DataSource {
    List<Employee> getEmployeeDetails();
}
