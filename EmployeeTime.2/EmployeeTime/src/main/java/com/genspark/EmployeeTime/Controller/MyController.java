package com.genspark.EmployeeTime.Controller;

import com.genspark.EmployeeTime.Entity.Employee;
import com.genspark.EmployeeTime.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String Status(@RequestParam(value = "name", defaultValue = "Enter Employee ID") String name){
        return name;
    }
    @GetMapping("/time")
    public List<Employee> getCharacters(){
        return this.employeeService.getAllEmployee();}

    @GetMapping("/time/{eId}")
    public Employee getCharacter(@PathVariable String eId){
        return this.employeeService.getEmployeeById(Integer.parseInt(eId));
    }

    @PostMapping("/Status")
    public Employee addCharacter(@RequestBody Employee unit){
        return this.employeeService.addEmployee(unit);}

    @PutMapping("/Status")
    public Employee updateCharacter(@RequestBody Employee unit){
        return this.employeeService.updateEmployee(unit);}

    @DeleteMapping("/time/{eId}")
    public String deleteCharacter(@PathVariable String eId){
        return this.employeeService.deleteEmployee(Integer.parseInt(eId));
    }
}
