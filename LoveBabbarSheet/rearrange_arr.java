// import java.util.Arrays;

// public class rearrange_arr {
//     public static void rearrange(int arr[]) {
//         Arrays.sort(arr);  // [1,2,3,4,5,6]
        
//         int n = arr.length;
//         int[] result = new int[n];
        
//         // Two pointers approach
//         int left = 0, right = n-1;
//         int idx = 0;
        
//         while(left <= right) {
//             // Max element at even indices
//             if(idx % 2 == 0) {
//                 result[idx++] = arr[right--];
//             }
//             // Min element at odd indices  
//             else {
//                 result[idx++] = arr[left++];
//             }
//         }
        
//         // Copy back to original array
//         for(int i = 0; i < n; i++) {
//             arr[i] = result[i];
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6};
//         rearrange(arr);
//         System.out.println(Arrays.toString(arr)); // Output: [6, 1, 5, 2, 4, 3]
//     }
// }
