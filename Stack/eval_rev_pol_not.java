import java.util.Stack;

public class eval_rev_pol_not {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String op : tokens) {
            if (op.equals("+")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second + first);
            } else if (op.equals("-")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second - first);
            } else if (op.equals("*")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second * first);
            } else if (op.equals("/")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second / first);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String[] tokens1 = { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens1)); // Output: 9

        String[] tokens2 = { "4", "13", "5", "/", "+" };
        System.out.println(evalRPN(tokens2)); // Output: 6
    }
}

// to find: Evaluate the value of an arithmetic expression in Reverse Polish
// Notation.
// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9
// Input: tokens = ["4","13","5","/","+"]
// Output: 6

// steps to solve:
// 1. Create a stack to hold operands.
// 2. Loop through each token in the input array.
// 3. If the token is an operator (+, -, *, /), pop the top two operands from
// the stack, apply the operator, and push the result back onto the stack.
// 4. If the token is a number, convert it to an integer and push it onto the
// stack.
// 5. After processing all tokens, the stack will contain one element, which is
// the result of the expression. Pop and return this element.
// Time complexity: O(n), where n is the number of tokens in the input array.