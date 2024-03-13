package com.example.firstSpringCURD.services;

import java.util.List;

import com.example.firstSpringCURD.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findEmployeeById(int id);
    Employee updatEmployee(Employee employee);
    Employee deletEmployeebyID(int id);

    
}
