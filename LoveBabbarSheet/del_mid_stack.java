import java.util.Stack;

public class del_mid_stack {

    public static void deleteMid(Stack<Integer> s) {

        int len = s.size();
        Stack<Integer> temp = new Stack<>();

        // middle index 
        int mid = (len-1) / 2;

        // top se kitna pop karna
        int removeFromTop = len - mid - 1;

        // temp me shift
        for(int i = 0; i < removeFromTop; i++) {
            temp.push(s.pop());
        }

        // middle delete
        s.pop();

        // wapas push
        while(!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // before delete
        System.out.println("Before deleting middle element:");
        for(int i : s) {
            System.out.print(i+" ");
        }
        System.out.println();

        deleteMid(s);

        // after delete
        System.out.println("After deleting middle element:");
        for(int i : s) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}