package q4

import com.groovy.basics.q1.Gender

/**
 * Created by gaurav on 18/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Q4 employee = new Q4(1, "xyz", 100_000d,"abc", 12, Gender.MALE, "xyz");

        println employee;
    }
}
