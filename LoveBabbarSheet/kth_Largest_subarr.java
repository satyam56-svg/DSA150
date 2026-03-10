import java.util.PriorityQueue;

public class kth_Largest_subarr {
    public static int kthLargest(int arr[], int k) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            int sum = 0;
            
            for(int j = i; j < n; j++) {
                sum += arr[j];
                
                pq.add(sum);
                
                if(pq.size() > k) {
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = {10, -10, 20, -40};
        int k = 6;
        System.out.println("Kth largest sum of subarray is: " + kthLargest(arr, k));
    }
}
