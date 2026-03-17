// import java.util.Stack;

// public class paranthesisChecker {
//     public static boolean isBalanced(String s) {

//         Stack<Character> st = new Stack<>();

//         for(int i = 0; i < s.length(); i++) {

//             char ch = s.charAt(i);

//             // opening brackets
//             if(ch == '(' || ch == '{' || ch == '[') {
//                 st.push(ch);
//             }
//             // closing brackets
//             else if(ch == ')' || ch == '}' || ch == ']') {

//                 if(st.isEmpty()) return false;

//                 char top = st.peek();

//                 if((ch == ')' && top == '(') ||
//                    (ch == '}' && top == '{') ||
//                    (ch == ']' && top == '[')) {

//                     st.pop();
//                 }
//                 else {
//                     return false;
//                 }
//             }
//         }

//         return st.isEmpty();
//     }

//     public static void main(String[] args) {
//         String s = "{[()]}";
//         System.out.println(isBalanced(s)); // Output: true
//     }
// }
