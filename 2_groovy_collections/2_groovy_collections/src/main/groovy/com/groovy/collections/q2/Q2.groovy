package com.groovy.collections.q2

/**
 * Created by gaurav on 19/4/17.
 */
class Q2 {
    public static void main(String[] args) {

        List list =[11,33,11,4,2,3,6,2]

        Set set = list.toSet()

        println("List : $list")
        println("Set : $set")
        println("List with unique elements without set : ${list.unique()}")

    }
}
