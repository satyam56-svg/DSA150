import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class k_largest {
    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer>list=new ArrayList<>();
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int n=arr.length;
        
        for(int i=0; i<n; i++) {
            pq.add(arr[i]);
            if(pq.size()>k) {
                pq.poll();
            }
        }
        
        Stack<Integer>st=new Stack<>();
        while(!pq.isEmpty()) {
            st.push(pq.poll());
        }
        
        while(!st.isEmpty()) {
            list.add(st.pop());
        }
        
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 12, 2, 11, 4};
        int k = 3;
        ArrayList<Integer> result = kLargest(arr, k);
        System.out.println(result); // Output: [5, 12, 11]
    }
}
