import java.util.LinkedList;
import java.util.List;

public class find_close_elements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        LinkedList<Integer> list = new LinkedList<>();
        
        // Add all elements to LinkedList
        for (int num : arr) {
            list.add(num);
        }
        
        // Remove elements until size becomes k
        while (list.size() > k) {
            if (Math.abs(list.getFirst() - x) > Math.abs(list.getLast() - x)) {
                list.removeFirst(); // remove from left
            } else {
                list.removeLast();  // remove from right
            }
        }
        
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        
        List<Integer> result = findClosestElements(arr, k, x);
        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}
