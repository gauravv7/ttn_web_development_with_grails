package q6

/**
 * Created by gaurav on 18/4/17.
 */

class HourMinute {
    int hours;
    int minutes;

    HourMinute plus(HourMinute right) {
        new HourMinute([hours: this.hours + right.hours, minutes: this.minutes + right.minutes])
    }

    @Override
    String toString() {
        "hours: ${this.hours}, minutes: ${this.minutes}"
    }
}
