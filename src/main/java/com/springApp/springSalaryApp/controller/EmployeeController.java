package com.springApp.springSalaryApp.controller;


import com.springApp.springSalaryApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/calculacte")
    public double getWeekendSalary(@RequestParam int countOfWeekendDays,@RequestParam double averageSalary){
        employeeService.createEmployee(countOfWeekendDays,averageSalary);
        return employeeService.getWeekendSalary();
    }
}
