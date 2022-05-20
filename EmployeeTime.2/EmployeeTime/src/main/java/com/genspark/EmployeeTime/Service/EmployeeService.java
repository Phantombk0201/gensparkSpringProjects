package com.genspark.EmployeeTime.Service;

import com.genspark.EmployeeTime.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    Employee getEmployeeById(int eId);
    Employee addEmployee(Employee e);
    Employee updateEmployee(Employee e);
    String deleteEmployee(int eId);
}
