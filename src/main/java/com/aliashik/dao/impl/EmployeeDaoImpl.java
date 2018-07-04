package com.aliashik.dao.impl;

import com.aliashik.dao.EmployeeDao;
import com.aliashik.dataSource.DataSource;
import com.aliashik.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Employee> getEmployees() {
        return dataSource.getEmployeeDetails();
    }
}
