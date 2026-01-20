import java.util.*;

public class Im_Stack_by_queue {

    static class MyStack {
        Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.add(x);
            int size = q.size();
            for (int i = 0; i < size - 1; i++) {
                q.add(q.remove());
            }
        }

        public int pop() {
            return q.remove(); 
        }

        public int top() {
            return q.peek(); 
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }

    // main method for testing
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element: " + st.top());  // 30
        System.out.println("Popped: " + st.pop());        // 30
        System.out.println("Top element now: " + st.top()); // 20
        System.out.println("Is empty? " + st.empty());     // false
    }
}

// steps:
// 1. Create a Queue to hold stack elements.
// 2. For push operation, add the element to the queue and then rotate the queue to place the new element at the front.
// 3. For pop operation, simply remove the front element of the queue.