package com.example.firstSpringCURD.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.firstSpringCURD.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee",Employee.class);

        List<Employee> empl = query.getResultList();
        return empl;
    
    }

    @Override
    public Employee findEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee updatEmployee(Employee employee) {
        return entityManager.merge(employee);    
    }

    @Override
    public Employee deletEmployeebyID(int id) {
        Employee e = entityManager.find(Employee.class, id);
        entityManager.remove(e);
        return e;
    }
    

}
