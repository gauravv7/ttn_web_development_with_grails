package com.groovy.collections.q14

/**
 * Created by gaurav on 19/4/17.
 */
class Q14 {

    public static void main(String[] args) {
        (1..100).each {
            if(it%3==0 && it%5==0){
                print "fizzBuzz "
            }else if(it%3==0) {
                print "fizz "
            }else if(it%5==0) {
                print "buzz "
            } else print "${it} "
        }
    }
}
