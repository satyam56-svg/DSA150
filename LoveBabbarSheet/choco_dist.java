import java.util.ArrayList;
import java.util.Collections;

public class choco_dist {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        
        int n = arr.size();
        
        // edge cases
        if(m == 0 || n == 0)
            return 0;
            
        if(n < m)
            return -1;
        
        // Step 1: sort
        Collections.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Step 2: sliding window
        for(int i = 0; i <= n - m; i++) {
            
            int diff = arr.get(i + m - 1) - arr.get(i);
            
            if(diff < minDiff)
                minDiff = diff;
        }
        
        return minDiff;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(4);
        arr.add(7);
        arr.add(9);
        arr.add(2);
        arr.add(23);
        arr.add(25);
        arr.add(41);
        arr.add(30);
        arr.add(40);
        arr.add(28);
        arr.add(42);
        arr.add(30);
        arr.add(44);
        arr.add(48);
        arr.add(43);
        
        int m = 7; // Number of students
        
        int result = findMinDiff(arr, m);
        
        if(result != -1)
            System.out.println("Minimum difference is: " + result);
        else
            System.out.println("Not enough chocolates to distribute.");
    }
}
