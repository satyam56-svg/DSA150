// package Sorting;
// import java.util.Arrays;

// public class max_sum_flip {
//         public static long maximizeSum(long a[], int n, int k) {

//         Arrays.sort(a);

//         // flip negative numbers first
//         for(int i=0; i<n && k>0; i++) {

//             if(a[i] < 0) {
//                 a[i] = -a[i];
//                 k--;
//             }
//         }

//         // agar k odd bacha hai
//         if(k % 2 == 1) {

//             Arrays.sort(a);   // smallest element find karne ke liye

//             a[0] = -a[0];
//         }

//         long sum = 0;

//         for(long num : a) {
//             sum += num;
//         }

//         return sum;
//     }

//     public static void main(String[] args) {
//         long[] a = {-2, 0, 5, -1, 2};
//         int n = a.length;
//         int k = 4;

//         long result = maximizeSum(a, n, k);
//         System.out.println(result); // Output: 10
//     }
// }
