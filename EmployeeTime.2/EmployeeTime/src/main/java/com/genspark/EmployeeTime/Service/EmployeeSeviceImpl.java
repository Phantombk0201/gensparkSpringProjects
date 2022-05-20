package com.genspark.EmployeeTime.Service;

import com.genspark.EmployeeTime.Dao.EmployeeDao;
import com.genspark.EmployeeTime.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSeviceImpl implements  EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployee() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int eId) {
        Optional <Employee> e = this.employeeDao.findById(eId);
        Employee employee = null;
        if(e.isPresent()){
            employee = e.get();
        }else{
            throw  new RuntimeException("Employee not found");
        }
        return employee;
    }

    @Override
    public Employee addEmployee(Employee e) {
        return this.employeeDao.save(e);
    }

    @Override
    public Employee updateEmployee(Employee e) {
        return this.employeeDao.save(e);
    }

    @Override
    public String deleteEmployee(int eId) {
        this.employeeDao.deleteById(eId);
        return null;
    }
}
