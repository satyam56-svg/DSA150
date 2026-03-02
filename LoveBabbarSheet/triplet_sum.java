import java.util.Arrays;

public class triplet_sum {

    public static boolean hasTripletSum(int arr[], int target) {

        Arrays.sort(arr);   // Pehle sort karo
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true;
                } 
                else if (sum < target) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 9;

        System.out.println(hasTripletSum(arr, target));
    }
}