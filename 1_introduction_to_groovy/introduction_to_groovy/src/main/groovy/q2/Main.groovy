package q2

import com.groovy.basics.q1.Gender

/**
 * Created by gaurav on 18/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "xyz", 100_000d,"abc", 12, Gender.MALE, "xyz");

        println "Property accessors";
        println employee.empId;
        println employee.company;
        println employee.salary;
        println "------------"
        println "Method accessors";
        println employee.getEmpId();
        println employee.getCompany();
        println employee.getSalary();
        println "------------"
        println "@ operator";
        println employee.@empId;
        println employee.@company;
        println employee.@salary;

    }
}
