import java.util.Arrays;
import java.util.PriorityQueue;

public class car_trips {
    public static boolean carPooling(int[][] trips, int capacity) {

        // sort trips by pickup loc
        Arrays.sort(trips, (a, b) -> a[1] - b[1]);

        // min heap based on drop loc
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]);

        int curr = 0;

        for (int i = 0; i < trips.length; i++) {
            int psg = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];

            // drop psg
            while (!pq.isEmpty() && pq.peek()[0] <= from) {
                curr -= pq.poll()[1];
            }

            // pick new psg
            curr += psg;

            if (curr > capacity)
                return false;

            pq.add(new int[] { to, psg });
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] trips = { { 2, 1, 5 }, { 3, 3, 7 } };
        int capacity = 4;
        System.out.println(carPooling(trips, capacity)); // false
    }
}

// to find: car pooling possible or not given trips and capacity
// steps:
// 1. sort trips by pickup loc
// 2. use min heap to track drop loc and psg count
// 3. for each trip, drop psg whose drop loc <= current pickup loc
// 4. pick new psg and check capacity
// time: O(n log n) for sorting and heap operations
// space: O(n) for heap

// Dry Run:
// trips = [[2,1,5],[3,3,7]], capacity = 4
// sorted trips = [[2,1,5],[3,3,7]]
// pq = [], curr = 0
// i=0: psg=2, from=1, to=5
//   drop psg: pq empty
//   pick new psg: curr=2, pq=[[5,2]]
// i=1: psg=3, from=3, to=7
//   drop psg: pq.peek()[0]=5 > 3, no drop
//   pick new psg: curr=5 > capacity(4) -> return false
// Output: false

