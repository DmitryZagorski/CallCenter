package com.epam.call_center.models;

public class Employee {
    private String name;
    private EmployeeStatus employeeStatus;
    private EmployeeType employeeType;

    public Employee(String name, EmployeeStatus employeeStatus, EmployeeType employeeType) {
        this.name = name;
        this.employeeStatus = employeeStatus;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
