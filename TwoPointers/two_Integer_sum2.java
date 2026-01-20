public class two_Integer_sum2 {
    public static int[] twoSum(int[] arr, int target) {
        int i=0,j=arr.length-1;
        while(i<j) {
            if(arr[i]+arr[j]==target) {
                return new int[]{i+1,j+1};
            } else if(arr[i]+arr[j]>target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
