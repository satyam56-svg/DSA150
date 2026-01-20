package Intervals;
import java.util.Arrays;
import java.util.List;
public class interval_can_attend_meeting {
    public static class Interval {
        public int start, end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return true;
        }

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < intervals.get(i - 1).end) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<Interval> meetings1 = Arrays.asList(
            new Interval(0, 30),
            new Interval(5, 10),
            new Interval(15, 20)
        );

        List<Interval> meetings2 = Arrays.asList(
            new Interval(7, 10),
            new Interval(2, 4)
        );

        List<Interval> meetings3 = Arrays.asList(
            new Interval(1, 5),
            new Interval(6, 10),
            new Interval(11, 15)
        );

        System.out.println("Meetings1: " + canAttendMeetings(meetings1)); // false (overlapping)
        System.out.println("Meetings2: " + canAttendMeetings(meetings2)); // true (no overlap)
        System.out.println("Meetings3: " + canAttendMeetings(meetings3)); // true (no overlap)
    }
}
