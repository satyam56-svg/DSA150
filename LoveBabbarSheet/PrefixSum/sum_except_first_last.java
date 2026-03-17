public class sum_except_first_last {
    public static int sumExceptFirstLast(int[] arr) {
        // your code here
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        return sum-arr[0]-arr[arr.length-1];
    }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(sumExceptFirstLast(arr)); // Output: 14
        }
}
