import java.util.*;

public class kthLargest {

    private PriorityQueue<Integer> pq;
    private int k;

    public kthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(); // min heap

        for(int n : nums) {
            pq.add(n);
            if(pq.size() > k)
                pq.poll();
        }
    }

    public int add(int val) {
        pq.add(val);

        if(pq.size() > k)
            pq.poll();

        return pq.peek();
    }

    public static void main(String[] args) {
        kthLargest obj = new kthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(obj.add(3));  // returns 4
        System.out.println(obj.add(5));  // returns 5
        System.out.println(obj.add(10)); // returns 5
        System.out.println(obj.add(9));  // returns 8
        System.out.println(obj.add(4));  // returns 8
    }
}

// to find: kth Largest element in a stream
// approach: min heap of size k
// TC: O(log k) for add operation
// SC: O(k) for heap storage

// steps:
// 1. Initialize a min heap (priority queue) and store the value of k.
// 2. Add all elements from the initial array to the min heap.
//    - If the size of the heap exceeds k, remove the smallest element (the root).
// 3. For each add operation:
//    - Add the new value to the min heap.
//    - If the size of the heap exceeds k, remove the smallest element.
//    - The root of the min heap now represents the kth largest element.