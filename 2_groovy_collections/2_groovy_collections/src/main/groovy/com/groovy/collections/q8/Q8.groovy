package com.groovy.collections.q8

/**
 * Created by gaurav on 19/4/17.
 */
class Q8 {

    public static void main(String[] args) {

        Employee employee1 = new Employee()
        employee1.setName("priyanka")
        employee1.setAge(23);
        employee1.setSalary(5500)

        Employee employee2 = new Employee()
        employee2.setName("ankur")
        employee2.setAge(20)
        employee2.setSalary(3000)


        Employee employee3 = new Employee()
        employee3.setName("rivam")
        employee3.setAge(25)
        employee3.setSalary(6000)


        Employee employee4 = new Employee()
        employee4.setName("abhijit")
        employee4.setAge(25)
        employee4.setSalary(4000)


        List list=[];
        list.add(employee1)
        list.add(employee2)
        list.add(employee3)
        list.add(employee4)

        println(list)
        println()
        println("Employees with salary greater than 5000")
        println list.groupBy{ it.getSalary()>5000 }.get(true)

        println()
        println("Name of youngest employee")
        Employee employee5 = list.min{it.age}
        println employee5.name

        println()
        println "Name of oldest employee"
        Employee employee6=list.max{it.age}
        println employee6.name

        println()
        println "Name of employee with greatest salary"
        Employee employee7 = list.max{it.salary}
        println employee7.name


        println()
        println("list of name of all employee")
        println list*.name;

    }
}
