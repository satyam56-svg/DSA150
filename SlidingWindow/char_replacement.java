import java.util.HashMap;

public class char_replacement {
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        int maxFreq = 0; 
        
        int left = 0; 
        
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, freq.get(ch));

            if ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1); 
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println("Longest substring length: " + characterReplacement(s, k));
    }
}

// steps:
// 1. create a hashmap(char,int) to store frequency of each char
// 2. initiliase maxFreq=0: window ke andar sbse zyada aane wala char ka freq
// 3. initiliase left=0: sliding window ke left pointer ki pos
// 4. initilase maxLength=0: result me longest valid substring ka length store krenge
// 5. string me right pointer se iterate kr rhe hain
// 6. current char jo right pointer pr h
// 7. current char ki frequency increment kr rhe hai hashmap me
// 8. maxFreq ko update kar rhe hain: window me sbse zyada jo char repeat ho rha h uski freq
// 9. agar window ka size minus maxFreq zyada ho jaye K se , mtlb zyada char replace krna pdega
// 10. left pointer waale character ki frequency kam kr rhe h kyunki window se hata rhe h
// 11. window ko shrink krne ke liye left pointer aage bdha rhe hain
// 12. abhi wale valid window ka size maxLength me store kar lo agar bda ho to
// 13. loop ke baad longest substring length return kar rhe h jisme k replacement allowed h