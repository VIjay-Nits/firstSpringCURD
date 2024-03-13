package com.example.firstSpringCURD.restController;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstSpringCURD.entity.Employee;
import com.example.firstSpringCURD.services.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeesService;

    public EmployeeRestController(EmployeeService employeesService){
        this.employeesService=employeesService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
            return employeesService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee findEmployeeById(@PathVariable int employeeId){
        Employee employee = employeesService.findEmployeeById(employeeId);
        if (employee==null) {
            throw new RuntimeException("Employee not found - "+employeeId);
            
        }
        return employee;
    }

    @PostMapping("/employee")
    public Employee updatEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee newEmployee = employeesService.updatEmployee(employee);
        return newEmployee;
    }

    @PutMapping("/employee")
    public Employee updatEmployee1(@RequestBody Employee employee){
             Employee newEmployee = employeesService.updatEmployee(employee);
        return newEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public Employee deletEmployeebyID(@PathVariable int employeeId){
        Employee employee = employeesService.deletEmployeebyID(employeeId);
        if (employee==null) {
            throw new RuntimeException("Employee not found - "+employeeId);
            
        }
        return employee;
    }

}
