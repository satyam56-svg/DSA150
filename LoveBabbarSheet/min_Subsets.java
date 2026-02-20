import java.util.Arrays;

public class min_Subsets {
    public static int minSubset(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        // find the total sum..
        int sum=0;
        for(int num:arr) {
            sum+=num;
        }
        
        int sub=0;
        int count=0;
        // start from piche
        for(int i=arr.length-1; i>=0; i--) {
            sub+=arr[i];
            count++;
            if(sub>sum-sub) {
                return count;
            }
        }
        
        return Math.min(count,arr.length-count);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 2};
        int result = minSubset(arr);
        System.out.println("Minimum number of elements in the subset: " + result);
    }
}
