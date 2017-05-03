package com.groovy.collections.q22

class Employee {
    int employeeNumber
    String name
    int age
    String departmentName
    Double salary

    Employee(int employeeNumber, String name, int age, String departmentName, Double salary) {
        this.employeeNumber = employeeNumber
        this.name = name
        this.age = age
        this.departmentName = departmentName
        this.salary = salary
    }


    @Override
    String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", name='" + name + '\'' +
                ", Age=" + age +
                ", departmentName='" + departmentName + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
