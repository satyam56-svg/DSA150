import java.util.PriorityQueue;

public class kth_largest {
    public static int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int num: nums) {
            pq.add(num);
            if(pq.size()>k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k)); // Output: 5
    }
}

// to find: kth largest element in an array
// approach: min heap of size k
// time complexity: O(N log k)
// space complexity: O(k)

// steps:
// 1. Create a min heap (priority queue).
// 2. Iterate through each element in the array.
// 3. Add the element to the min heap.
// 4. If the size of the min heap exceeds k, remove the smallest element (the root).
// 5. After processing all elements, the root of the min heap will be the kth largest element.
