package com.groovy.collections.q11

/**
 * Created by gaurav on 19/4/17.
 */
class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        println "Enter the number to print table of: "
        int n = Integer.parseInt(sc.next())

        (1..10).each { it -> println "$n x $it = ${it*n}" }
    }
}
