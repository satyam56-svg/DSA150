// package Hashing;

// import java.util.HashMap;

// public class find_subarrays {
//     public static int findSubarray(int arr[]) {
        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         int sum = 0;
//         int count = 0;
        
//         map.put(0, 1);   // important
        
//         for(int i = 0; i < arr.length; i++) {
            
//             sum += arr[i];
            
//             if(map.containsKey(sum)) {
//                 count += map.get(sum);
//             }
            
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }
        
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, -1, 2, 3, -2, 4};
//         System.out.println(findSubarray(arr));
//     }
// }
