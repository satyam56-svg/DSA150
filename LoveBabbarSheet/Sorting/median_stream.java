// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.PriorityQueue;

// public class median_stream {
//     public static ArrayList<Double> getMedian(int[] arr) {

//         PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder()); // max heap
//         PriorityQueue<Integer> right = new PriorityQueue<>(); // min heap

//         ArrayList<Double> ans = new ArrayList<>();

//         for (int x : arr) {

//             // insert
//             if (left.isEmpty() || x <= left.peek()) {
//                 left.add(x);
//             } else {
//                 right.add(x);
//             }

//             // balance
//             if (left.size() > right.size() + 1) {
//                 right.add(left.poll());
//             } else if (right.size() > left.size()) {
//                 left.add(right.poll());
//             }

//             // median
//             if (left.size() == right.size()) {
//                 ans.add((left.peek() + right.peek()) / 2.0);
//             } else {
//                 ans.add((double) left.peek());
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 15, 1, 3};
//         ArrayList<Double> medians = getMedian(arr);
//         System.out.println(medians); // Output: [5.0, 10.0, 5.0, 4.0]
//     }
// }
