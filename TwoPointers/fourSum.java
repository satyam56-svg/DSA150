import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return result;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;  // skip duplicates

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;  // skip duplicates

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // skip duplicates for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum.fourSum(nums, target);
        System.out.println(result);
    }
}

// steps:
// 1. create arraylist double(result)
// 2. agar arr ka size 4 se chota ho to simply result return krdo
// 3. arr ko sort kro ab
// 4. run a first loop from i=0 to i<n-3 tk
// 5. if (i>0 aur arr[i]==arr[i-1]) continue;
// 6. run a second loop(inner) from j=i+1 to j<n-2
// 7. if (j>i+1 aur arr[j]==arr[j-1]) continue;
// 8. initialse left=j+1,right=n-1;
// 9. run a third loop(inner inner) cond:(left<right)
// 10. initialse sum = arr[i]+arr[j]+arr[left]+arr[right]
// 11. if sum==target , result me saare value ko add kro
// 12. skip duplicates for left and right
// 13. left++,right--
// 14. else if sum<target, left++
// 15. else right--
// 16. return result