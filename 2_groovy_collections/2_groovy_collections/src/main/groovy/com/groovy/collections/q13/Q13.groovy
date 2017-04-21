package com.groovy.collections.q13

/**
 * Created by gaurav on 19/4/17.
 */
class Q13 {
    public static void main(String[] args) {
        String s = "abcdeaaaabbbbcccccdd"
        println getOccurences(s, 'a'.charAt(0))
    }

    public static int getOccurences(String s, Character c){
        int counter=0;
        s.each { chrctr -> if(chrctr.charAt(0)==c) counter++ }
        return counter;
    }
}
