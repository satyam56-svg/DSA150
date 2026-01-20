public class product_except_itself {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];
        
        // left products
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        
        // right products
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        
        // multiply left and right
        for (int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }
        
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Example array
        int[] result = productExceptSelf(nums);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " "); // Output: 24 12 8 6
        }
        System.out.println(); // New line after output
    }
}
