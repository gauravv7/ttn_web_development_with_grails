package q6

/**
 * Created by gaurav on 18/4/17.
 */
class Main {

    public static void main(String[] args) {
        HourMinute hourMinute = new HourMinute([hours: 1, minutes: 20]);
        println hourMinute + new HourMinute([hours: 2, minutes: 00]);
    }
}
