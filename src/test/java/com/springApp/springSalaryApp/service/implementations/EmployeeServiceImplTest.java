package com.springApp.springSalaryApp.service.implementations;

import com.springApp.springSalaryApp.service.EmployeeService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {

    @Test
    void getWeekendSalary() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.createEmployee(30,60000);
        assertEquals(59178.08,employeeService.getWeekendSalary());
    }
}