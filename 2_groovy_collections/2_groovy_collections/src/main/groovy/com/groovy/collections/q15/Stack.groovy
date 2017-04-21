package com.groovy.collections.q15

/**
 * Created by gaurav on 19/4/17.
 */
class Stack {
    List list = []

    Stack(list){
        this.list = list
    }

    public void push(def obj){
        list.push(obj)
    }

    public def pop(){
        return list.pop()
    }

    public def top(){
        return list.last()
    }


    @Override
    public String toString() {
        return "Stack{"+ list + "}";
    }
}
