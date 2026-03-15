// package SlidingWindow;

// import java.util.HashMap;
// import java.util.HashSet;

// public class find_Sub_String {
//     public static int findSubString(String str) {

//         HashSet<Character> set = new HashSet<>();
//         for (char ch : str.toCharArray()) {
//             set.add(ch);
//         }

//         int required = set.size();

//         int left = 0;
//         int count = 0;
//         int minLen = str.length();

//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int right = 0; right < str.length(); right++) {

//             char ch = str.charAt(right);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);

//             if (map.get(ch) == 1) {
//                 count++;
//             }

//             while (count == required) {

//                 minLen = Math.min(minLen, right - left + 1);

//                 char leftChar = str.charAt(left);
//                 map.put(leftChar, map.get(leftChar) - 1);

//                 if (map.get(leftChar) == 0) {
//                     count--;
//                 }

//                 left++;
//             }
//         }

//         return minLen;
//     }

//     public static void main(String[] args) {
//         String str = "aabcbcdbca";
//         int result = findSubString(str);
//         System.out.println("Length of the smallest substring containing all distinct characters: " + result);
//     }

// }
