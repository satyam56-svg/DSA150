import java.util.*;

public class topK_frequent_element {
    public static int[] topKFrequent(int[] nums, int k) {

        // Step 0: Input array ko frequency map mein convert karo
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        // Step 1: Frequency values ko array mein store karna nahi hai, balki entries pe kaam karna hai
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        
        // Step 2: Entries ko frequency ke basis par descending order mein sort karo
        entries.sort((a, b) -> b.getValue() - a.getValue());
        
        // Step 3: Top k elements ko extract karo
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = entries.get(i).getKey();
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [1, 2]
    }
}
