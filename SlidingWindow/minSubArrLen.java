public class minSubArrLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < n; end++) {
            sum += nums[end]; // expand window

            // shrink window while sum >= target
            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum subarray length: " + result); // Output: 2
    }
}
