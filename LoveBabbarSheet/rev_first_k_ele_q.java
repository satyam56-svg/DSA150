import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class rev_first_k_ele_q {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(q.size()<k || k<=0) {
            return q;
        }
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=0; i<k; i++) {
            st.push(q.remove());
        }
        
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        
        int rem = q.size()-k;
        
        for(int i=0; i<rem; i++) {
            q.add(q.remove());
        }
    
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;
        Queue<Integer>result = reverseFirstK(q, k);
        while(!result.isEmpty()) {
            System.out.println(result.remove());
        }
    }
}
