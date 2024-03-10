package com.example.firstSpringCURD.restController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstSpringCURD.dao.EmployeeDAO;
import com.example.firstSpringCURD.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO employeeDAO){
        this.employeeDAO=employeeDAO;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
            return employeeDAO.findAll();
    }

}
