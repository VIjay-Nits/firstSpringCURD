package com.example.firstSpringCURD.restController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstSpringCURD.entity.Employee;
import com.example.firstSpringCURD.services.EmployeeService;

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

}
