package com.groovy.collections.q7

/**
 * Created by gaurav on 19/4/17.
 */
class Q7 {


    public static void main(String[] args) {

        List list = [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]

        println( list.unique().sort().reverse())

    }
}