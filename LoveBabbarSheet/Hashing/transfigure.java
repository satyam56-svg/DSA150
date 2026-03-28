// import java.util.HashMap;

// public class transfigure {
//     public static int transfigureFun(String A, String B) {
//         if (A.length() != B.length()) return -1;
        
//         int n = A.length();
        
//         HashMap<Character, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < n; i++) {
//             char ch = A.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
        
//         for (int i = 0; i < n; i++) {
//             char ch = B.charAt(i);
//             if (!map.containsKey(ch) || map.get(ch) == 0) {
//                 return -1;
//             }
//             map.put(ch, map.get(ch) - 1);
//         }
        
//         int i = n - 1;
//         int j = n - 1;
//         int count = 0;
        
//         while (i >= 0) {
//             if (A.charAt(i) == B.charAt(j)) {
//                 i--;
//                 j--;
//             } else {
//                 i--;
//                 count++;
//             }
//         }
        
//         return count;
//     }

//     public static void main(String[] args) {
//         String A = "abc";
//         String B = "bca";
//         int result = transfigureFun(A, B);
//         System.out.println(result); // Output: 2
//     }
// }
