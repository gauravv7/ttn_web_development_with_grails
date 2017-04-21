package com.groovy.collections.q20

/**
 * Created by gaurav on 19/4/17.
 */
class Q20 {
    public static void main(String[] args) {
        Map m = ['1' : 2, '2' : 3, '3' : 4, '2':5]
        println "m="+m
        println "checking if m['1'] is there in the map?"+m.containsKey('1')
    }
}
