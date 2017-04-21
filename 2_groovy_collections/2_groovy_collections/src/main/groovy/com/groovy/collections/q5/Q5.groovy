package com.groovy.collections.q5

/**
 * Created by gaurav on 19/4/17.
 */
class Q5 {

    public static void main(String[] args) {

        List listWithEvenIndexElements = ['a','b',1,4,'e',8,10,'p']
        List listWithOddIndexElementToRemove=[]
        listWithEvenIndexElements.eachWithIndex{ entry, i ->
            if(i%2!=0)
                listWithOddIndexElementToRemove.add(entry)
        }

        println(listWithEvenIndexElements.removeAll(listWithOddIndexElementToRemove))
    }
}
