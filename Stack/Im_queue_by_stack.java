import java.util.*;

public class Im_queue_by_stack {

    static class MyQueue {
        Stack<Integer> input;
        Stack<Integer> output;

        public MyQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.pop();
        }

        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }

    // main method for testing
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println("Front element: " + q.peek()); // 10
        System.out.println("Removed: " + q.pop());        // 10
        System.out.println("Front element now: " + q.peek()); // 20
        System.out.println("Is empty? " + q.empty());     // false
    }
}

// steps:
// 1. create two stack(int) named input & output
// 2. push: element ko input me push kedenge
// 3. pop: agr output empty ho to ek while loop chlao jb tk input empty n ho jaye saare element ko output me daaldo, return output.pop()
// 4. peek: same process as pop bs last me output.peek() return kro
// 5. empty() fun: check if queue is empty or not