package q2

import com.groovy.basics.q1.Gender
import com.groovy.basics.q1.Person

/**
 * Created by gaurav on 18/4/17.
 */
class Employee extends Person {
    int empId;
    String company;
    Double salary;

    Employee(empId, company, salary, String name, int age, Gender gender, String address) {
        super(name, age, gender, address);
        this.empId = empId;
        this.company = company;
        this.salary = salary;
    }

    public getEmpId(){
        println "printing from getter";
        return empId;
    }
}
