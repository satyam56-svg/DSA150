import java.util.HashMap;
import java.util.Map;

public class single_number {
    // Approach 1: Using HashMap
    public static int singleNumberUsingHashMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;  // If no unique number is found
    }

    // Approach 2: Using XOR bit manipulation
    public static int singleNumberUsingXOR(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        
        // Using HashMap
        int singleNumber1 = singleNumberUsingHashMap(nums);
        System.out.println("Single number using HashMap: " + singleNumber1);
        
        // Using XOR
        int singleNumber2 = singleNumberUsingXOR(nums);
        System.out.println("Single number using XOR: " + singleNumber2);
    }
}
