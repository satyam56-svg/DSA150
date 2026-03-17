// public class are_rotations {
//     public static boolean areRotations(String s1, String s2) {
//         // code here
//         if (s1.length() != s2.length())
//             return false;

//         int n = s1.length();

//         // try every possible rotation start
//         for (int start = 0; start < n; start++) {

//             int j = 0;

//             while (j < n &&
//                     s1.charAt((start + j) % n) == s2.charAt(j)) {
//                 j++;
//             }

//             if (j == n)
//                 return true;
//         }

//         return false;

//     }

//     public static void main(String[] args) {
//         String s1 = "abcde";
//         String s2 = "deabc";

//         if (areRotations(s1, s2)) {
//             System.out.println("The strings are rotations of each other.");
//         } else {
//             System.out.println("The strings are not rotations of each other.");
//         }
//     }
// }
