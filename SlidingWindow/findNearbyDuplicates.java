import java.util.HashSet;
import java.util.Set;

public class findNearbyDuplicates {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If duplicate found within window
            if (set.contains(nums[i])) {
                return true;
            }

            // Add current element to set
            set.add(nums[i]);

            // Keep window size ≤ k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k)); // Output: true
    }
}
