public class move_zero_end {
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int curr = 0;

        // Step 1: Move all non-zero elements to front
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[curr] = arr[i];
                curr++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while(curr < n) {
            arr[curr] = 0;
            curr++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0};
        pushZerosToEnd(arr);
        
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
