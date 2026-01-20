package binarysearch;
public class eat_banana {
    public static int max(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }  
        }
        return max;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = max(piles);
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            int hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Minimum eating speed: " + minEatingSpeed(piles, h));
    }
}

// STEPS:
// 1. initialse left=1 and right=max(piles)..
// 2. max(piles) used for finding maximum element in array..
// 3. initialse answer with right
// 4. run a while loop with condition(left<=right)
// 5. initialse mid=left+(right-left)/2
// 6. initialse hours=0
// 7. run a for loop in piles array, hours+=(pile+mid-1)/mid
// 8. if hours<=h, answer=mid, right=mid-1
// 9. else, left=mid+1
// 10. return answer