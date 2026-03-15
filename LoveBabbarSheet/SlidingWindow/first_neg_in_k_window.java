// package SlidingWindow;
// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Deque;
// import java.util.List;

// public class first_neg_in_k_window {
//     public static List<Integer> firstNegInt(int arr[], int k) {
        
//         List<Integer> list = new ArrayList<>();
//         Deque<Integer> dq = new ArrayDeque<>();
//         int n = arr.length;
        
//         for(int right = 0; right < n; right++) {
            
//             // Step 1: Add negative index
//             if(arr[right] < 0) {
//                 dq.offerLast(right);
//             }
            
//             // Step 2: Remove out-of-window index
//             if(!dq.isEmpty() && dq.peekFirst() == right - k) {
//                 dq.pollFirst();
//             }
            
//             // Step 3: When window formed
//             if(right >= k - 1) {
                
//                 if(dq.isEmpty()) {
//                     list.add(0);
//                 } else {
//                     list.add(arr[dq.peekFirst()]);
//                 }
//             }
//         }
        
//         return list;
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
//         int k = 3;
//         System.out.println(firstNegInt(arr, k)); // Output: [-1, -7, -15, 0, 0, 0]
//     }
// }
