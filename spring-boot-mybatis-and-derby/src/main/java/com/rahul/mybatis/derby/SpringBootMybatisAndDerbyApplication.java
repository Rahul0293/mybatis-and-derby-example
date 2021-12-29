package com.rahul.mybatis.derby;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rahul.mybatis.derby.model.Employee;
import com.rahul.mybatis.derby.repository.EmployeeMyBatisRepository;

@SpringBootApplication
public class SpringBootMybatisAndDerbyApplication implements CommandLineRunner{
	
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EmployeeMyBatisRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisAndDerbyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10011 , "Rahul", "Malavade", "rahul@gmail.com")));
		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10012 , "Shubham", "Raval", "Shubham@gmail.com")));
		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10013 , "Jaydeep", "Dudhtra", "Jaydeep@gmail.com")));
		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10014 , "Tom", "Patel", "Tom@gmail.com")));
		logger.info("Inserting -> {}", employeeRepository.insert(new Employee(10015 , "Jerry", "Patel", "jerry@gmail.com")));
		
		
		 logger.info("Employee id 10011 -> {}", employeeRepository.findById(10011));

	     logger.info("Update 10003 -> {}", employeeRepository.update(new Employee(10011, "ram", "Stark", "ramesh123@gmail.com")));

	     employeeRepository.deleteById(10013 );

	     logger.info("All users -> {}", employeeRepository.findAll());
	    }


}
