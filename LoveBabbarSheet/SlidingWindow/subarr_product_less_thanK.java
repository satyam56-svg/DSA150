// package SlidingWindow;

// public class subarr_product_less_thanK {
//     public static long countSubArrayProductLessThanK(long arr[], int n, long k) {
        
//         long product = 1;
//         long count = 0;
//         int left = 0;
        
//         for(int right = 0; right < n; right++) {
            
//             product = product * arr[right];
            
//             while(product >= k && left <= right) {
//                 product = product / arr[left];
//                 left++;
//             }
            
//             count = count + (right - left + 1);
//         }
        
//         return count;
//     }

//     public static void main(String[] args) {
//         long arr[] = {10, 5, 2, 6};
//         int n = arr.length;
//         long k = 100;
        
//         long result = countSubArrayProductLessThanK(arr, n, k);
//         System.out.println("Count of subarrays with product less than " + k + " is: " + result);
//     }
// }
