package com.springApp.springSalaryApp.service.implementations;

import com.springApp.springSalaryApp.model.Employee;
import com.springApp.springSalaryApp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;



@Service
public class EmployeeServiceImpl implements EmployeeService {
    Employee employee;
    @Override
    public void createEmployee(int countOfWeekendDays, double averageSalary) {
        employee = new Employee(countOfWeekendDays,averageSalary);
    }
    //unit test for this method is in test folder
    @Override
    public double getWeekendSalary() {
         return BigDecimal.valueOf(((employee.getAverageSalary() * 12) / 365) * employee.getCountOfWeekendDays())
                 .setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
    }
}
