
import java.util.Stack;
public class min_stack {

    Stack<Integer>st;
    int min;

    public void MinStack() {
        st=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val<=min) {
            st.push(min);
            min=val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.pop()==min) {
            min=st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        min_stack ms = new min_stack();
        ms.MinStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        System.out.println(ms.getMin()); // Output: 3
        ms.pop();
        System.out.println(ms.top()); // Output: 3
        System.out.println(ms.getMin()); // Output: 3
    }  
}

// steps:
// 1. Use a stack to store elements and a variable to track the minimum.
// 2. On push, if the new value is less than or equal to the current minimum, push the current minimum onto the stack before pushing the new value and update the minimum.
// 3. On pop, if the popped value is the current minimum, pop again to retrieve the previous minimum.
// 4. The top method returns the top element of the stack.
