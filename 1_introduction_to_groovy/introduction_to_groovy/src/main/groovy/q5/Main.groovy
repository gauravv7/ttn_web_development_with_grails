package q5

/**
 * Created by gaurav on 18/4/17.
 */
class Main {
    public static void main(String[] args) {
        if('test') { println "test evaluated to true inside if" } else { println "test evaluated to false inside if" }

        if('Test') { println "Test evaluated to true inside if" } else { println "Test evaluated to false inside if" }

        if('null') { println "'null' evaluated to true inside if" } else { println "'null' evaluated to false inside if" }

        if(null) { println "null evaluated to true inside if" } else { println "null evaluated to false inside if" }

        if(100) { println "100 evaluated to true inside if" } else { println "100 evaluated to false inside if" }
        if(0) { println "0 evaluated to true inside if" } else { println "0 evaluated to false inside if" }

        List l = new ArrayList();
        if(l) { println "${l} evaluated to true inside if" } else { println "${l} evaluated to false inside if" }
        l.add(null);
        if(l) { println "${l} evaluated to true inside if" } else { println "${l} evaluated to false inside if" }


    }
}
