package com.nikhitha.HelloNameProject.HelloNameProject;

public class Employee {
    String empId;
    String empName;
    String Age;
    String isManager;

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", Age='" + Age + '\'' +
                ", isManager='" + isManager + '\'' +
                '}';
    }
}
