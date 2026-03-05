import java.util.HashMap;

public class longest_substring_k {
    public static int longestKSubstr(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int max = -1;
        
        for(int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            while(map.size() > k) {
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);
                
                if(map.get(l) == 0) {
                    map.remove(l);
                }
                
                left++;
            }
            
            if(map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;

        System.out.println(longestKSubstr(s, k));
    }
}
