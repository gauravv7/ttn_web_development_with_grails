package com.groovy.collections.q8

/**
 * Created by gaurav on 19/4/17.
 */
class Q8 {

    public static void main(String[] args) {

        Employee employee1 = new Employee("abc", 23, 5500)

        Employee employee2 = new Employee("def", 20, 3000)

        Employee employee3 = new Employee("ghi", 25, 6000)

        Employee employee4 = new Employee("jkl", 25, 4000)

        def list=[];
        list.add(employee1)
        list.add(employee2)
        list.add(employee3)
        list.add(employee4)

        println(list)
        println()
        println("Employees with salary greater than 5000")
        println list.findAll { it.getSalary()>5000 }

        println()
        println("name of youngest employee")
        Employee employee5 = list.min{it.age}
        println employee5.name

        println()
        println "name of oldest employee"
        Employee employee6=list.max{it.age}
        println employee6.name

        println()
        println "name of employee with greatest salary"
        Employee employee7 = list.max{it.salary}
        println employee7.name


        println()
        println("list of name of all employee")
        println list*.name;

    }
}
