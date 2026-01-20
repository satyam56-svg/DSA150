import java.util.Collections;
import java.util.PriorityQueue;

public class last_stone_weight {
    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap

        // insert all stones
        for (int s : stones)
            pq.add(s);

        while (pq.size() > 1) {
            int a = pq.poll(); // largest
            int b = pq.poll(); // second largest

            if (a != b)
                pq.add(a - b);
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones)); // Output: 1
    }
}

// to find: last stone weight after smashing stones
// approach: max heap
// TC: O(n log n) for heap operations
// SC: O(n) for heap storage
// steps:
// 1. Initialize a max heap (priority queue) and add all stone weights to it.
// 2. While there is more than one stone in the heap:
//    - Extract the two heaviest stones (the root elements).
//    - If they are not equal, insert the difference back into the heap.
// 3. If one stone remains, return its weight; otherwise, return 0.
