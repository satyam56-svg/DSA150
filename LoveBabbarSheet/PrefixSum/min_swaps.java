// package PrefixSum;

// public class min_swaps {
//     public static int minSwap(int[] arr, int k) {
        
//         int count = 0;
        
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] <= k) count++;
//         }
        
//         int bad = 0;
        
//         for(int i = 0; i < count; i++) {
//             if(arr[i] > k) bad++;
//         }
        
//         int ans = bad;
        
//         for(int i = 0, j = count; j < arr.length; i++, j++) {
            
//             if(arr[i] > k) bad--;   // element window se bahar
            
//             if(arr[j] > k) bad++;   // element window me andar
            
//             ans = Math.min(ans, bad);
//         }
        
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 1, 5, 6, 3};
//         int k = 3;
//         int result = minSwap(arr, k);
//         System.out.println(result); // Output: 1
//     }
// }
