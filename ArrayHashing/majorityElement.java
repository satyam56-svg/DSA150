import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement {

    // Function to find all elements that appear more than n/3 times
    public static List<Integer> majorityElement1(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();

        // Get frequency map of elements
        HashMap<Integer,Integer>freq=Freq(nums);

        // Check for elements with frequency greater than n/3
        for (int key : freq.keySet()) {
            if (freq.get(key) > n / 3) {
                list.add(key);
            }
        }
        return list;
    }

    // Function to calculate frequency of each element in the array
    public static  HashMap<Integer,Integer>Freq(int arr[]) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        // Counting frequency of each element
        for(int i=0;i<n;i++) {

            // If element already exists, increment its count
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);

                // If element does not exist, initialize its count to 1
            } else {
                map.put(arr[i],1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majorityElement1(arr));

        int arr2[] = {1,1,1,3,3,2,2,2};
        System.out.println(majorityElement1(arr2));
    }
}
