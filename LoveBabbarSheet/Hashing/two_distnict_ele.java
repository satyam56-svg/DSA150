import java.util.HashMap;

public class two_distnict_ele {
    public static int totalElements(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        
        for(int right = 0; right < arr.length; right++) {
            
            // expand window
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            
            // shrink if more than 2 distinct elements
            while(map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                
                if(map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4};
        System.out.println(totalElements(arr)); // Output: 3 (subarray [1, 2, 1])
    }
}
