import java.util.Stack;

public class valid_paranthese {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}"; // Example input
        boolean result = isValid(s); // Function call
        System.out.println("Is valid parentheses: " + result); // Output result
    }
}

// to find: Whether the input string of parentheses is valid (properly closed and nested).
// steps:
// 1. Use a stack to keep track of opening parentheses.
// 2. Iterate through each character in the string.
// 3. Push opening parentheses onto the stack.
// 4. For closing parentheses, check if the stack is empty (invalid) or if the top of the stack matches the corresponding opening parenthesis.
// 5. At the end, if the stack is empty, the parentheses are valid; otherwise, they are not.
