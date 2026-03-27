import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeat {
    public static String firstNonRepeating(String s) {
        
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.add(ch);
            
            // 🔥 fix here
            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.poll();
            }
            
            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }
        
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        String result = firstNonRepeating(s);
        System.out.println(result); // Output: "a#bb"
    }
}
