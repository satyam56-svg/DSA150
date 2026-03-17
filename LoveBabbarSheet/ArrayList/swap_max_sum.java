import java.util.ArrayList;
import java.util.Arrays;

public class swap_max_sum {
    public static long maxSum(Long[] arr) {

        Arrays.sort(arr);

        int n = arr.length;

        ArrayList<Long> list = new ArrayList<>();

        int i = 0;
        int j = n - 1;

        // small-large-small-large arrangement
        while(i <= j) {

            if(i != j) {
                list.add(arr[i++]);
                list.add(arr[j--]);
            } else {
                list.add(arr[i++]);
            }
        }

        long sum = 0;

        // circular sum
        for(int k=0;k<n;k++) {
            sum += Math.abs(list.get(k) - list.get((k+1)%n));
        }

        return sum;
    }

    public static void main(String[] args) {
        Long[] arr = {1L, 2L, 3L, 4L, 5L};
        long result = maxSum(arr);
        System.out.println("Maximum sum of absolute differences: " + result);
    }
}
