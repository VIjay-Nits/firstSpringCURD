package com.example.firstSpringCURD.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Employee findEmployeeById(int id) {
        return employeeDAO.findEmployeeById(id);
    }

    @Transactional
    @Override
    public Employee updatEmployee(Employee employee) {
        return employeeDAO.updatEmployee(employee) ;   
    }

    @Transactional
    @Override
    public Employee deletEmployeebyID(int id) {
        return employeeDAO.deletEmployeebyID(id);    
    }

}
