// import java.util.*;

// public class wordBreak {
//     public static boolean wordBreak(String s, List<String> wordDict) {
//         // Dictionary को set में डाल रहे हैं ताकि O(1) में lookup हो
//         Set<String> wordSet = new HashSet<>(wordDict);
        
//         // dp[i] = true means s[0...i-1] can be segmented
//         boolean[] dp = new boolean[s.length() + 1];
//         dp[0] = true; // Empty string case

//         for (int i = 1; i <= s.length(); i++) {
//             for (int j = 0; j < i; j++) {
//                 // अगर पहले का substring बन सकता है और बाकी substring dictionary में है
//                 if (dp[j] && wordSet.contains(s.substring(j, i))) {
//                     dp[i] = true;
//                     break; // और check करने की जरूरत नहीं
//                 }
//             }
//         }
//         return dp[s.length()];
//     }

//     public static void main(String[] args) {
//         String s = "leetcode";
//         List<String> wordDict = Arrays.asList("leet", "code");
//         System.out.println(wordBreak(s, wordDict)); // Output: true

//         s = "applepenapple";
//         wordDict = Arrays.asList("apple", "pen");
//         System.out.println(wordBreak(s, wordDict)); // Output: true

//         s = "catsandog";
//         wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
//         System.out.println(wordBreak(s, wordDict)); // Output: false
//     }
// }
