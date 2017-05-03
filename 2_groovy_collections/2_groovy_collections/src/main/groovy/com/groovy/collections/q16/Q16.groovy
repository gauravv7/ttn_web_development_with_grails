package com.groovy.collections.q16

/**
 * Created by gaurav on 19/4/17.
 */
class Q16 {
    public static void main(String[] args) {
        Map m = [:]
        (1..10).each{ m.put("frnd${it}", it+10) }
        println m
    }
}
