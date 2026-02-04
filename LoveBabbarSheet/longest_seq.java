import java.util.HashSet;

public class longest_seq {
    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr) {
            set.add(num);
        }
        
        int maxLen = 0;
        for(int num: arr) {
            // Check if num is START of sequence (num-1 missing)
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;
                
                // Count consecutive numbers
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4 (sequence is 1,2,3,4)
    }
}
