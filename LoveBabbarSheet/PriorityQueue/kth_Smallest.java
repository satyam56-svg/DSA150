// package PriorityQueue;
// // package LoveBabbarSheet;

// // import java.util.Collections;
// // import java.util.PriorityQueue;

// // public class kth_Smallest {
// //     public static int kthSmallest(int[] arr, int k) {
// //         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
// //         for (int num : arr) {
// //             pq.add(num);
// //             if (pq.size() > k) {
// //                 pq.poll(); // remove largest
// //             }
// //         }
// //         return pq.peek(); // smallest among top k → k-th smallest
// //     }

// //     public static void main(String[] args) {
// //         int arr[] = {7, 10, 4, 3, 20, 15};
// //         int k = 3;
// //         int result = kthSmallest(arr, k);
// //         System.out.println(k + "th smallest element is: " + result);
// //     }
// // }
