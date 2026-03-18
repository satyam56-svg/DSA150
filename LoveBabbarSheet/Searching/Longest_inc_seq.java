public class Longest_inc_seq {
    public static int lis(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        int size = 0;

        for(int num : arr) {
            int idx = lowerBound(temp, 0, size, num);

            temp[idx] = num;

            if(idx == size) {
                size++;
            }
        }

        return size;
    }

    // Binary Search Function
    // first index jahan arr[index] >= target
    static int lowerBound(int arr[], int low, int high, int target) {
        while(low < high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of Longest Increasing Subsequence is " + lis(arr));
    }
}
