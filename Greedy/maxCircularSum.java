package Greedy;

public class maxCircularSum {
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int currMax=0,maxSum=Integer.MIN_VALUE;
        int currMin=0,minSum=Integer.MAX_VALUE;

        for(int num:nums) {
            currMax=Math.max(num,currMax+num);
            maxSum=Math.max(maxSum,currMax);

            currMin=Math.min(num,currMin+num);
            minSum=Math.min(minSum,currMin);

            totalSum+=num;
        }

        if(maxSum<0) return maxSum;
        return Math.max(maxSum,totalSum-minSum);
    }

    public static void main(String[] args) {
        int[] nums = {5,-3,5};
        System.out.println(maxSubarraySumCircular(nums)); // Output: 10
    }
}

// STEPS:
// 1. initialse totalSum=0
// 2. initialse currMax=0,maxSum=(-infinity)
// 3. initialse currMin=0,minSum=(+infinity)
// 4. run a for loop through all elements in array
// 5. currMax=max(num,currMax+num), maxSum=max(maxSum,currMax)
// 6. currMin=min(num,currMin+num), minSum=min(minSum,currMin)
// 7. totalSum+=num
// 8. agr maxSum -ve ho to return maxSum
// 9. return max(maxSum,totalSum-minSum);