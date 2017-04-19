import q3.Q3Pattern;
import q11.Q11;

/**
 * Created by gaurav on 19/4/17.
 */
public class Main {
    public static void main(String[] args) {

        switch (args[0]){
            case "q1":
                com.groovy.basics.q1.Main.main(args);
                break;

            case "q2":
                q2.Main.main(args);
                break;

            case "q3":
                Q3Pattern.main(args);
                break;

            case "q4":
                q4.Main.main(args);
                break;

            case "q5":
                q5.Main.main(args);
                break;

            case "q6":
                q6.Main.main(args);
                break;

            case "q7":
                q7.Q7.main(args);
                break;

            case "q8":
                q8.Q8.main(args);
                break;

            case "q9":
                q9.Q9.main(args);
                break;

            case "q10":
                q10.Q10.main(args);
                break;

            case "q11":
                Q11.main(args);
                break;

            default:
                System.out.println("invalid input, please specify as q<(1-11)>");
        }
    }
}
