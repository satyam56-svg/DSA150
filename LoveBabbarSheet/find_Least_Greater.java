import java.util.ArrayList;
import java.util.TreeSet;

public class find_Least_Greater {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        
        int[] res = new int[n];
        
        for(int i = n - 1; i >= 0; i--) {
            
            Integer greater = set.higher(arr[i]);
            
            if(greater == null) {
                res[i] = -1;
            } else {
                res[i] = greater;
            }
            
            set.add(arr[i]);
        }
        
        for(int num : res) {
            list.add(num);
        }
        
        return list;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 4, 5, 2, 10, 8 };

        ArrayList<Integer> result = findLeastGreater(n, arr);
        System.out.println(result);
    }
}
