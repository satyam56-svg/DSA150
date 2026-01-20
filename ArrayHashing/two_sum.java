import java.util.*;  // Java ki saari utility classes ko import kar rahe hain (jaise HashMap, Arrays)

public class two_sum {
    
    // twoSum function - jo do numbers ke indices return karega jinka sum target ke barabar ho
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>(); // yeh hashmap value -> index store karega
        int[] res = new int[2]; // result array jisme 2 indices store honge

        // array ko traverse kar rahe hain
        for (int i = 0; i < nums.length; i++) {
            int partner = target - nums[i]; // har element ka partner nikal rahe hain (target - current value)

            // check kar rahe hain kya yeh partner pehle hi array mein aa chuka hai
            if (map.containsKey(partner)) {
                res[0] = map.get(partner); // partner ka index result mein daal rahe hain
                res[1] = i;                // current element ka index bhi result mein daal rahe hain
                return res;                // dono indices mil gaye, ab return kar do
            }

            // agar partner nahi mila, to current element ko map mein store kar lo
            map.put(nums[i], i); // value -> index
        }

        // agar koi pair nahi mila to default [0, 0] ya jo bhi initialize kiya ho return hoga
        return res;
    }

    public static void main(String[] args) {
        two_sum solution = new two_sum(); // class ka object banaya
        int[] nums = {2, 7, 11, 15}; // input array
        int target = 9; // target sum

        int[] result = solution.twoSum(nums, target); // function call karke result le liya

        // result ko print kar rahe hain
        System.out.println("Indices: " + Arrays.toString(result)); // Output: Indices: [0, 1]
    }
}
