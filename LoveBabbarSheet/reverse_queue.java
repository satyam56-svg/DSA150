import java.util.*;
public class reverse_queue {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer>st = new Stack<>();
        while(!isEmpty1(q)) {
            st.push(q.remove());
        }
        while(!isEmpty2(st)) {
            q.add(st.pop());
        }
    }
    
    public static boolean isEmpty1(Queue<Integer>q) {
        return q.isEmpty();
    }
    
    public static boolean isEmpty2(Stack<Integer>st) {
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        reverseQueue(q);
        while(!isEmpty1(q)) {
            System.out.println(q.remove());
        }
    }
}
