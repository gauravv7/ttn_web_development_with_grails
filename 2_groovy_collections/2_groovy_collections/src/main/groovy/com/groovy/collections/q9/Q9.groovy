package com.groovy.collections.q9

/**
 * Created by gaurav on 19/4/17.
 */

public class Q9 {

    public static void main(String[] args) {

        String s = "this string needs to be split";
        println("String is: " + s)
        println ('string.tokenize(" ") ::' + s.tokenize(" "))
        println ("string.tokenize() :: "+s.tokenize())



        println ('string.split(" ") :: '+s.split(" "))
        println ('string.split(/\\s/) ::'+s.split(/\s/))



        String s1 = "are.you.trying.to.split.me.mister?"

        println()
        println("string is :" +s1)

        println ('string.tokenize(".") ::' +s1.tokenize("."))
        println ('string.split(".") ::'+ s1.split("."))

    }


}



