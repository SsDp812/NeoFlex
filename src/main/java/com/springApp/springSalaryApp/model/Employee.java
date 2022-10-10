package com.springApp.springSalaryApp.model;


public class Employee {
    private int countOfWeekendDays;
    private double averageSalary;
    public Employee(int countOfWeekendDays, double averageSalary){
        this.countOfWeekendDays = countOfWeekendDays;
        this.averageSalary = averageSalary;
    }

    public int getCountOfWeekendDays() {
        return this.countOfWeekendDays;
    }
    public void setCountOfWeekendDays(int countOfWeekendDays){
        this.countOfWeekendDays = countOfWeekendDays;
    }

    public double getAverageSalary() {
        return this.averageSalary;
    }
    public void setAverageSalary(double averageSalary){
        this.averageSalary = averageSalary;
    }
}
