package Intervals;
import java.util.Arrays;

public class interval_overlap_erase {
    public static int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int removals = 0;
        int prevEnd = intervals[0][1];

        // Step 2: iterate through intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // Overlap → remove one interval
                removals++;
                prevEnd = Math.min(prevEnd, intervals[i][1]); 
            } else {
                // No overlap → just move forward
                prevEnd = intervals[i][1];
            }
        }

        return removals;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals)); // Output: 1
    }
}
