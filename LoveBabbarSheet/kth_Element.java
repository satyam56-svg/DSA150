import java.util.Collections;
import java.util.PriorityQueue;

public class kth_Element {
    public static int kthElement(int a[], int b[], int k) {
        
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : a) {
            pq.add(num);
            if(pq.size() > k) pq.poll();
        }
        
        for(int num : b) {
            pq.add(num);
            if(pq.size() > k) pq.poll();
        }
        
        return pq.peek();
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 6, 7, 9};
        int b[] = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(a, b, k));
    }
}
