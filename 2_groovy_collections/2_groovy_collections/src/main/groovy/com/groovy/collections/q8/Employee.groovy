package com.groovy.collections.q8

/**
 * Created by gaurav on 19
 * /4/17.
 */
class Employee
{
    String name;
    int age;
    float salary;

    Employee(String name, int age, float salary) {
        this.name = name
        this.age = age
        this.salary = salary
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}