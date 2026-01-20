package binarysearch;
public class max_subArray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums)); // Output: 6
    }
}

// STEPS:
// 1. initialse maxSum & currSum with first element of array
// 2. run a for loop (i=1 to i<arr.length)
// 3. hr ek i ki value pr, currSum=max(arr[i],currSum+arr[i]), maxSum=max(maxSum,currSum)
// 4. return maxSum