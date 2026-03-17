// import java.util.HashMap;
// import java.util.Map;

// public class is_subset {
//     public static boolean isSubset(int a[], int b[]) {
//         Map<Integer,Integer> map = new HashMap<>();
        
//         // Count frequencies in a
//         for(int num : a) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
        
//         // Check b elements
//         for(int num : b) {
//             if(!map.containsKey(num) || map.get(num) == 0) {  // ✅ Fixed!
//                 return false;
//             }
//             map.put(num, map.get(num) - 1);
//         }
        
//         return true;
//     }

//     public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//         int[] b = {2, 3, 5};
//         System.out.println(isSubset(a, b)); // Output: true

//         int[] c = {1, 2, 2, 3};
//         int[] d = {2, 2, 4};
//         System.out.println(isSubset(c, d)); // Output: false
//     }
// }
