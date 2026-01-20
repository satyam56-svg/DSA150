package binarysearch;

public class search_rotated_array {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        // Jab tak low pointer high se chhota ya barabar hai, tab tak loop chalega
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Mid index nikal rahe hain

            // Agar mid par value target ke barabar hai, toh wahi index return kar do
            if (nums[mid] == target) {
                return mid;
            }

            // Ab check karte hain kaunsa half sorted hai
            if (nums[low] <= nums[mid]) {
                // Left side sorted hai
                // Check karo kya target left side mein aata hai
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // Target left half mein hai toh high ko left le aao
                } else {
                    low = mid + 1;   // Nahi toh right half mein search karo
                }
            } else {
                // Right side sorted hai
                // Check karo kya target right side mein aata hai
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;   // Target right half mein hai toh low ko right le jao
                } else {
                    high = mid - 1;  // Nahi toh left half mein search karo
                }
            }
        }
        // Agar target nahi mila toh -1 return kar do
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        System.out.println("Target found at index: " + result); // Output: Target found at index: 4
    }
}
