// import java.util.Arrays;

// public class count_triplet {
//     public static long countTriplets(int n, int sum, long arr[]) {
//         Arrays.sort(arr);
//         long count = 0;
        
//         for(int i = 0; i < n - 2; i++) {
//             int left = i + 1;
//             int right = n - 1;
            
//             while(left < right) {
//                 if(arr[i] + arr[left] + arr[right] < sum) {
//                     count += right - left;
//                     left++;
//                 } 
//                 else {
//                     right--;
//                 }
//             }
//         }
        
//         return count;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         int sum = 8;
//         long arr[] = {1, 2, 3, 4};

//         long result = countTriplets(n, sum, arr);
//         System.out.println("Number of triplets: " + result);
//     }
// }
