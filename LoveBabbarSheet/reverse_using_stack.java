import java.util.Stack;

public class reverse_using_stack {
    public String reverse(String S) {
        // code here
        Stack<Character>stack=new Stack<>();
        
        for(int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }

        String ans = "";

        while(!stack.isEmpty()) {
            ans = ans + stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        reverse_using_stack obj = new reverse_using_stack();
        String S = "Hello, World!";
        String reversed = obj.reverse(S);
        System.out.println("Original String: " + S);
        System.out.println("Reversed String: " + reversed);
    }
}
