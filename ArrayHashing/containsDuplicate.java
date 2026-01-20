import java.util.HashMap;
public class containsDuplicate {
    public static boolean contains_Duplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {

            if (map.containsKey(num)) {
                return true;
            }

            map.put(num, 1);
        }
        
        return false;
    }
	public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = contains_Duplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}

// STEPS:
// 1. Create a HashMap(integer,integer) jo element ko store krega..
// 2. agr element phele se map mein hai, to duplicate mil gya
// 3. nhi to element ko map mein add krdo