public class smallest_subarr_sum {
    public static int smallestSumSubarray(int a[], int size) {
        
        int minSum = a[0];
        int currSum = a[0];
        
        for(int i = 1; i < size; i++) {
            currSum = Math.min(a[i], currSum + a[i]);
            minSum = Math.min(minSum, currSum);
        }
        
        return minSum;
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 1, -4, 5, -1};
        int size = a.length;
        
        int result = smallestSumSubarray(a, size);
        System.out.println("Smallest sum of a contiguous subarray is: " + result);
    }
}
