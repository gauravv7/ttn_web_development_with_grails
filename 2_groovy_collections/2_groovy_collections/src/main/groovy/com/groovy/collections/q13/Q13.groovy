package com.groovy.collections.q13

/**
 * Created by gaurav on 19/4/17.
 */
class Q13 {
    public static void main(String[] args) {
        Closure getOccurences = { s1,c ->
            def counter=0;
            s1.each { chrctr -> if(chrctr.charAt(0)==c) counter++ }
            return counter;
        }

        println getOccurences("abcdeaaaabbbbcccccdd", 'a'.charAt(0))
    }
}
