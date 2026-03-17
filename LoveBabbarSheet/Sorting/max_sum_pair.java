// package Sorting;
// import java.util.Arrays;

// public class max_sum_pair {
//     public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) {
//         Arrays.sort(arr);
//         int sum=0;
//         int i=N-1;
//         while(i>0) {
//             if(arr[i]-arr[i-1]<K) {
//                 sum+=arr[i]+arr[i-1];
//                 i-=2;
//             } else {
//                 i--;
//             }
//         }
        
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 10, 15, 17};
//         int N = arr.length;
//         int K = 4;
//         int result = max_sum_pair.maxSumPairWithDifferenceLessThanK(arr, N, K);
//         System.out.println("Maximum sum of pairs with difference less than " + K + ": " + result);
//     }
// }
