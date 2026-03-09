import java.util.ArrayList;
import java.util.PriorityQueue;

public class mergeK_sorted_arr {
    public static ArrayList<Integer> mergeArrays(int[][] mat) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int[] arr : mat) {
            for(int num : arr) {
                pq.add(num);
            }
        }

        while(!pq.isEmpty()) {
            list.add(pq.poll());
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 3, 5}, {2, 4, 6}, {0, 7, 8}};
        ArrayList<Integer> result = mergeArrays(mat);
        System.out.println(result);
    }
}
