import java.util.*;

public class group_anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        // HashMap bnao jisme key hogi sorted string aur value hogi list of anagrams
        HashMap<String,List<String>>map=new HashMap<>();

        // Har string ke liye uske characters ki frequency count karo
        for(String s: strs) {
            int count[]=new int[26];
            for(char c: s.toCharArray()) {
                count[c-'a']++;
            }

            // Frequency array ko string mein convert karke key banao
            StringBuilder keyBuilder = new StringBuilder();
            for(int i=0; i<26; i++) {
                keyBuilder.append(count[i]).append('#');
            }

            // key ko string mein convert karo
            String key = keyBuilder.toString();

            // HashMap mein key check karo aur uske corresponding list mein string add karo
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Ab string ko uske corresponding list mein add karo
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        
        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
        // Output should be groups of anagrams
    }

}
