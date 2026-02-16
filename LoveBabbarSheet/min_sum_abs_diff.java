// import java.util.Arrays;

// public class min_sum_abs_diff {
//     public static long findMinSum(int[] A, int[] B, int N) {
//         Arrays.sort(A);
//         Arrays.sort(B);
//         long sum=0;
        
//         for(int i=0; i<N; i++) {
//             sum+=(Math.abs(A[i]-B[i]));
//         }
        
//         return sum;
//     }

//     public static void main(String[] args) {
//         min_sum_abs_diff obj = new min_sum_abs_diff();
//         int[] A = {1, 4, 2};
//         int[] B = {3, 5, 1};
//         int N = A.length;
//         long result = obj.findMinSum(A, B, N);
//         System.out.println("Minimum sum of absolute differences: " + result);
//     }
// }
