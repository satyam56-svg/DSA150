import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class k_subarr_max {
    public static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int right = 0; right < arr.length; right++) {
            
            // 1️⃣ Remove indices that are out of this window
            if(!dq.isEmpty() && dq.peekFirst() == right - k) {
                dq.pollFirst();
            }
            
            // 2️⃣ Remove smaller elements from back
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[right]) {
                dq.pollLast();
            }
            
            // 3️⃣ Add current index
            dq.offerLast(right);
            
            // 4️⃣ When window is formed
            if(right >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(maxOfSubarrays(arr, k)); // Output: [3, 3, 5, 6]
    }
}
