package com.groovy.collections.q22

import groovy.transform.ToString

/**
 * Created by gaurav on 19/4/17.
 */
class Employee {
    int EmployeeNumber
    String Name
    int Age
    String DepartmentName
    Double Salary

    Employee(int employeeNumber, String name, int age, String departmentName, Double salary) {
        EmployeeNumber = employeeNumber
        Name = name
        Age = age
        DepartmentName = departmentName
        Salary = salary
    }


    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeNumber=" + EmployeeNumber +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
