package com.groovy.collections.q11

/**
 * Created by gaurav on 19/4/17.
 */
class Q11 {

    public static void main(String[] args) {
        def n
        System.in.withReader {
            println "Enter the number to print table of: "
            n = it.readLine() as Integer
        }

        (1..10).each { it -> println "$n x $it = ${it*n}" }
    }
}
