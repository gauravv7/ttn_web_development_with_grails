package com.groovy.collections.q12

/**
 * Created by gaurav on 21/4/17.
 */
class Q12 {

    public static void main(String[] args) {
        List l= ('a'..'z')
        println l
        println "elements after j are"
        l.each{ it -> if(it>'j') print it }
    }
}
