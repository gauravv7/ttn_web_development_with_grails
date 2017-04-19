package q7

/**
 * Created by gaurav on 18/4/17.
 */
class Q7 {
    public static void main(String[] args) {
        println "with each "; (1..10).each { idx -> println "3x${idx} = ${idx*3} " };
        println "";
        println "with upto "; 1.upto(10) {idx -> println "3x${idx} = ${idx*3} " } ;
        println "";
        println "with step "; 1.step(11, 1) {idx -> println "3x${idx} = ${idx*3} " } ;
    }
}
