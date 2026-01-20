package Greedy;
public class can_jump {
    public static boolean canJump(int[] nums) {
        int i = 0, n = nums.length - 1;
        int speed, reach;

        int maxReach = 0; 

        while (i <= maxReach) { 
            speed = nums[i];
            reach = i + speed;

            if (reach > maxReach) {
                maxReach = reach;
            }

            if (maxReach >= n) {
                return true;
            }

            i++; 
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums)); // Output: true

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums2)); // Output: false
    }
}

// STEPS:
// 1. initialse i=0 and n=arr.length-1
// 2. initialse speed,reach
// 3. initialse maxReach=0
// 4. run a while loop untill i<=maxReach
// 5. speed=arr[i],reach=i+speed
// 6. maxReach update kro
// 7. agar last index tak pahuch gya (true) return krdo
// 8. increment i
// 9. return false