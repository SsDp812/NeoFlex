package com.springApp.springSalaryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSalaryAppApplication {
	//request example
	//http://localhost:8080/calculacte/?countOfWeekendDays=14&averageSalary=70000
	public static void main(String[] args) {
		SpringApplication.run(SpringSalaryAppApplication.class, args);
	}

}
