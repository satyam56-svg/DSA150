// public class max_sub_str {
//     public static int maxSubStr(String str) {
//         // Write your code here
//         int count1 = 0;
//         int count2 = 0;
//         int ans = 0;

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == '0') {
//                 count1++;
//             } else {
//                 count2++;
//             }

//             if (count1 == count2) {
//                 ans++;
//             }
//         }

//         if (count1 != count2)
//             return -1;

//         return ans;
//     }

//     public static void main(String[] args) {
//         String str = "01001101";
//         int result = maxSubStr(str);
//         System.out.println(result); // Output: 4
//     }
// }
