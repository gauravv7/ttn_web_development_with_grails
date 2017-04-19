package q4

import com.groovy.basics.q1.Gender
import q2.Employee

/**
 * Created by gaurav on 18/4/17.
 */

class Q4 extends Employee {


    Q4(Object empId, Object company, Object salary, String name, int age, Gender gender, String address) {
        super(empId, company, salary, name, age, gender, address)
    }

    @Override
    String toString() {
        "Sachin is a man aged ${age} who lives at ${address}. He works for Intelligrape with employee id ${empId} and draws ${salary} lots of money !!!!."
    }
}
