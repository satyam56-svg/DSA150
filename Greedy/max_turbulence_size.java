// public class max_turbulence_size {
//     public static int maxTurbulenceSize(int[] arr) {
//         int n = arr.length;
//         if (n == 1)
//             return 1;

//         int max = 1;
//         int curr = 1;

//         boolean lastUp = false;
//         boolean lastDown = false;

//         for (int i = 1; i < n; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 if (lastUp) {
//                     curr = 2;
//                 } else {
//                     curr++;
//                 }
//                 lastUp = true;
//                 lastDown = false;
//             } else if (arr[i] < arr[i + 1]) {
//                 if (lastDown) {
//                     curr = 2;
//                 } else {
//                     curr++;
//                 }
//                 lastUp = false;
//                 lastDown = true;
//             } else {
//                 curr = 1;
//                 lastUp = false;
//                 lastDown = false;
//             }
//             max = Math.max(max, curr);
//         }

//         return max;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
//         System.out.println("Maximum Turbulence Size: " + maxTurbulenceSize(arr)); // Output: 5
//     }
// }

// // to find: the length of a maximum size turbulent subarray 
// // steps:
// // initialize max and curr to 1
// // iterate through the array from index 1 to n-1
// // compare each element with the next one to determine if it's increasing or decreasing
// // update curr based on the previous comparison
// // update max if curr is greater than max
// // return max