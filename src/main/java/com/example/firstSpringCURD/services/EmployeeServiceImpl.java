package com.example.firstSpringCURD.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.firstSpringCURD.dao.EmployeeDAO;
import com.example.firstSpringCURD.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
       return employeeDAO.findAll();
    }

}
