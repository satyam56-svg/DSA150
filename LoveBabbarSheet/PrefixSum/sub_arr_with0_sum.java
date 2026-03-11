// package PrefixSum;

// import java.util.HashSet;

// public class sub_arr_with0_sum {
//     public static boolean findsum(int arr[]) {
//         HashSet<Integer> seen = new HashSet<>();
//         int sum = 0;
//         for (int num : arr) {
//             sum += num;
//             if (sum == 0 || seen.contains(sum)) {
//                 return true;
//             }
//             seen.add(sum);
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, -3, 4, 5};
//         boolean result = findsum(arr);
//         System.out.println(result); // Output: true
//     }
// }
