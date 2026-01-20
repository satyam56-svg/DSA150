import java.util.HashMap;
public class subArraySum {
    public static int subArrSum(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize with prefix sum 0 occurring once
        map.put(0,1);

        int count=0;
        int prefixSum=0;

        for(int num:arr) {

            // Update the prefix sum
            prefixSum+=num;

            // Check if there is a prefix sum that when removed gives sum k
            int complement = prefixSum - k;

            // If such a prefix sum exists, add its frequency to count
            if(map.containsKey(complement)) {
                count+=map.get(complement);
            }

            // Update the frequency of the current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int k = 2;
        System.out.println(subArrSum(arr, k));
    }
}
