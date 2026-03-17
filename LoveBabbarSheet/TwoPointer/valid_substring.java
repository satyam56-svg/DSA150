// public class valid_substring {
//     public static int maxLength(String s) {
        
//         int left = 0;
//         int right = 0;
//         int max = 0;
        
//         // Left to Right
//         for(int i = 0; i < s.length(); i++) {
            
//             if(s.charAt(i) == '(') {
//                 left++;
//             }
//             else {
//                 right++;
//             }
            
//             if(left == right) {
//                 max = Math.max(max, 2 * right);
//             }
            
//             if(right > left) {
//                 left = 0;
//                 right = 0;
//             }
//         }
        
//         left = 0;
//         right = 0;
        
//         // Right to Left
//         for(int i = s.length() - 1; i >= 0; i--) {
            
//             if(s.charAt(i) == '(') {
//                 left++;
//             }
//             else {
//                 right++;
//             }
            
//             if(left == right) {
//                 max = Math.max(max, 2 * left);
//             }
            
//             if(left > right) {
//                 left = 0;
//                 right = 0;
//             }
//         }
        
//         return max;
//     }

//     public static void main(String[] args) {
//         String s = "(()())";
//         System.out.println(maxLength(s)); // Output: 6
//     }
// }
