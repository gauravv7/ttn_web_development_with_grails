package com.groovy.collections.q6

/**
 * Created by gaurav on 19/4/17.
 */
class Q6
{

    public static void main(String[] args)
    {

        List list = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]

        println "list is below"
        println list

        list.forEach{element->println("$element : ${element.getClass()}")}

        println("list.get(6).get(9):" +list.get(6).get(9) )
        println("list.get(5).get(1): " +list.get(5).get(1))

    }

}
