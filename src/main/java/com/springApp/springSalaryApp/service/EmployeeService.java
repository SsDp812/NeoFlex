package com.springApp.springSalaryApp.service;

public interface EmployeeService {
    void createEmployee(int countOfWeekendDays,double averageSalary);
    double getWeekendSalary();
}
