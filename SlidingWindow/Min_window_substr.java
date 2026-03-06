import java.util.*;

public class Min_window_substr {

    public static String minWindow(String s, String p) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = p.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if(map.get(ch) >= 0) {
                    count--;
                }
            }

            while(count == 0) {

                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if(map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if(map.get(leftChar) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return "";

        return s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        String s = "timetopractice";
        String p = "toc";

        String ans = minWindow(s, p);

        System.out.println("Minimum Window: " + ans);
    }
}