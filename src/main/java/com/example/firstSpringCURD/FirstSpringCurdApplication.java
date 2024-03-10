package com.example.firstSpringCURD;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.firstSpringCURD.dao.EmployeeDAO;
import com.example.firstSpringCURD.entity.Employee;

@SpringBootApplication
public class FirstSpringCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringCurdApplication.class, args);
	}

    @Bean
    CommandLineRunner CommandLineRunner(EmployeeDAO employeeDAO){
		return runner -> {
			System.out.println("Helooo*****************************************************************************");
			 getEmployees(employeeDAO);
		};
	}

	void getEmployees(EmployeeDAO employeeDAO ) {
		List<Employee> lt = employeeDAO.findAll();
		for (Employee e: lt) {
			System.out.println(e);
		}
	} 

	
}
