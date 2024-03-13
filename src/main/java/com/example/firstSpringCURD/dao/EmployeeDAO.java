package com.example.firstSpringCURD.dao;
import java.util.*;
import com.example.firstSpringCURD.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findEmployeeById(int id);
    Employee updatEmployee(Employee employee);
    Employee deletEmployeebyID(int id);

}
