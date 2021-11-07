package com.epam.call_center.models;

public class Employee {
    private String name;
    private CallType callType;
    private EmployeeType employeeType;

    public Employee(String name, CallType callType, EmployeeType employeeType) {
        this.name = name;
        this.callType = callType;
        this.employeeType = employeeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CallType getCallType() {
        return callType;
    }

    public void setCallType(CallType callType) {
        this.callType = callType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
