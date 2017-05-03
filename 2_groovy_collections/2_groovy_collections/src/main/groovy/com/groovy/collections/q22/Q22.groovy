package com.groovy.collections.q22

import com.groovy.collections.q22.Employee as Employee

class Q22 {

    public static void main(String[] args) {
        def employees = []
        (1..50).each { employees.add(new Employee(it, ((it%2)==0)?"n${it}":"e${it}", it+10, ((it%2)==0)?"d1":"d2", it*1000)) }
        employees.each {print it}

        def employees_salary_group =  employees.groupBy {
            element ->
                ((element.getSalary()>0 && element.getSalary()<=5000) ?
                        '0-5000':(element.getSalary()>=5001
                        && element.getSalary()<=10000)?'5000-10000':'10000&above')
        } // group by used in order to get generic implementation for all the
        println "\nemployees with salary range\n"
        println employees_salary_group

        println "Group the employees according to their department"
        println employees.groupBy { element -> element.getDepartmentName() }

        println "employees whose age is between 18 and 35: ${employees.findAll{element -> element.getAge()>=18 && element.getAge()<=35 }}"

        def elementWithSameFirstLetter =  employees.groupBy { element -> element.getName().charAt(0) }
        println "element With Same First Letter = ${elementWithSameFirstLetter}"
        elementWithSameFirstLetter.each { e ->
            println "# of employees in each group whose age is > 20: ${e.getValue().count{element -> element.getAge() > 20 } }"
        }

        println "Group the employees according to their department"
        println employees.groupBy { element -> element.getDepartmentName() }
    }
}
