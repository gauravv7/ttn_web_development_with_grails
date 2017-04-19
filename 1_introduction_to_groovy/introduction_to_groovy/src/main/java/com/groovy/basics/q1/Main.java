package com.groovy.basics.q1;

/**
 * Created by gaurav on 18/4/17.
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("abc", 12, Gender.MALE, "xyz");
        System.out.println("Property accessors");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.address);

        System.out.println("Method accessors");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());

    }

}
