import java.util.*;

public class string_window_max {
    public static String minWindow(String s, String t) {
        // Agar s ya t ka length zero ho to direct empty string return karo
        if (s.length() == 0 || t.length() == 0) return "";

        // Map me t ke characters ko store karo unke required counts ke saath
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // window Map me sliding window ke characters store karoge with counts
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;  // Sliding window ke pointers initialize kiye
        int valid = 0;  // Ye count karega kitne characters required amount me aaye hain

        // Result ke liye variables: start index aur length
        int start = 0, len = Integer.MAX_VALUE;

        // Sliding window expand karte raho jab tak right < s.length()
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;  // right pointer aage badhao

            // Agar current character t me chahiye to window map me count badhao
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                // Agar window me character count t ke required count ke barobar hua to valid badhao
                if (window.get(c).intValue() == need.get(c).intValue()) {
                    valid++;
                }
            }

            // Jab tak valid characters required size ke barabar hain window ko shrink karo from left
            while (valid == need.size()) {
                // Check karo agar current window smallest hai to result update karo
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }

                // Window ke left character ko remove karne ke liye prepare karo
                char d = s.charAt(left);
                left++;  // left pointer aage badhao to shrink window

                // Agar ye character bhi t me required hai to window map ko update karo
                if (need.containsKey(d)) {
                    // Agar ye character count ab required count se kam ho jata to valid kam karo
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        // Agar koi valid window nahi mila to empty string return karo nahi to substring return karo
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("Minimum window substring: " + result);  // Output: "BANC"
        
        // Test cases
        System.out.println(minWindow("a", "a"));  // Output: "a"
        System.out.println(minWindow("a", "aa")); // Output: ""
        System.out.println(minWindow("aa", "aa")); // Output: "aa"
        System.out.println(minWindow("aabbcc", "abc")); // Output: "aabbcc"
    }
}
