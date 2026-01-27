package LoveBabbarSheet;

import java.util.Arrays;

public class minDiff {
    public static int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int res = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            // Case 1: arr[0..i-1] +k, arr[i..n-1] -k
            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            if (arr[i] - k >= 0) {
                res = Math.min(res, maxH - minH);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,5,8,10};
        int k=2;
        System.out.println(getMinDiff(arr, k));
    }
}