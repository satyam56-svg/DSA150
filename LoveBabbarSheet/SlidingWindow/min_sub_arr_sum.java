// package SlidingWindow;
// public class min_sub_arr_sum {
//     public static int smallestSubWithSum(int x, int[] arr) {
//         for(int num : arr) {
//             if(num >= x) return 1;
//         }
        
//         int totalSum = 0;
//         for(int num : arr) {
//             totalSum += num;
//         }
//         if(totalSum < x) return 0;
        
//         int left = 0;
//         int minLen = Integer.MAX_VALUE;
//         int currSum = 0;
        
//         for(int right = 0; right < arr.length; right++) {
//             currSum += arr[right];
            
            
//             while(currSum > x && left <= right) {
//                 minLen = Math.min(minLen, right - left + 1);
//                 currSum -= arr[left];
//                 left++;
//             }
//         }
        
//         return minLen == Integer.MAX_VALUE ? 0 : minLen;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 4, 45, 6, 0, 19};
//         int x = 51;
//         System.out.println(smallestSubWithSum(x, arr)); // Output: 3
//     }
// }
