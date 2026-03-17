import java.util.Stack;

public class queue_use_2_stack {
    static Stack<Integer>s1=new Stack<>();
    static Stack<Integer>s2=new Stack<>();
    public static void push(int B) {
        s1.push(B);
    }

    public static int pop() {
        if(isEmpty(s1)) return -1;
        while(!isEmpty(s1)) {
            s2.push(s1.pop());
        }
        int val=s2.pop();
        while(!isEmpty(s2)) {
            s1.push(s2.pop());
        }

        return val;
    }
    
    public static boolean isEmpty(Stack<Integer>s) {
        return s.isEmpty();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        System.out.println(pop());
        System.out.println(pop());
    }
}
