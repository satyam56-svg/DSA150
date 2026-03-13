public class max_Index_diff {
    public static int maxIndexDiff(int[] arr) {

        int n = arr.length;

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        int i = 0, j = 0;
        int maxDiff = 0;

        while (i < n && j < n) {

            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 10, 5, 2, 8 };
        System.out.println(maxIndexDiff(arr)); // Output: 4
    }
}
