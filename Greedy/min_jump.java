public class  min_jump {
    public static int jump(int[] nums) {

        int n=nums.length;
        int jumps=0;    // total jumps liye
        int currentEnd=0;   // current jump se jo farthest index cover hota h
        int farthest=0; // scan karte hue ab tak ka farthest reachable index

        for(int i=0; i<n-1; i++) {
            farthest=Math.max(farthest,i+nums[i]);
            if(i==currentEnd) {
                jumps++;
                currentEnd=farthest;
                if(currentEnd>=n-1) break;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps required: " + jump(nums));
    }
}

// to find: minimum number of jumps to reach end of array
// approach: greedy
// TC: O(n) , SC: O(1)
// example: [2,3,1,1,4] -> 2 (2->3->4)

// steps:
// 1. Initialize jumps, currentEnd, farthest
// 2. Loop through array till n-1
// 3. Update farthest reachable index
// 4. If i reaches currentEnd, increment jumps and update currentEnd to farthest
// 5. Return jumps when end is reached
