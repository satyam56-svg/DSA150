// import java.util.Stack;

// public class decodeString {
//     public static String decodeString(String s) {

//         Stack<Integer> numStack = new Stack<>();
//         Stack<StringBuilder> strStack = new Stack<>();

//         StringBuilder curr = new StringBuilder();
//         int num = 0;

//         for (char ch : s.toCharArray()) {

//             if (Character.isDigit(ch)) {
//                 num = num * 10 + (ch - '0'); // multi-digit handle
//             }

//             else if (ch == '[') {
//                 numStack.push(num);
//                 strStack.push(curr);
//                 num = 0;
//                 curr = new StringBuilder();
//             }

//             else if (ch == ']') {
//                 int repeat = numStack.pop();
//                 StringBuilder prev = strStack.pop();

//                 for (int i = 0; i < repeat; i++) {
//                     prev.append(curr);
//                 }

//                 curr = prev;
//             }

//             else {
//                 curr.append(ch); // normal character
//             }
//         }

//         return curr.toString();
//     }

//     public static void main(String[] args) {
//         String s = "3[a2[c]]";
//         System.out.println(decodeString(s)); // Output: accaccacc
//     }
// }

// // steps: 
// // 1. Initialize two stacks: one for numbers and one for strings.
// // 2. Iterate through each character in the input string.
// // 3. If the character is a digit, build the current number.
// // 4. If the character is '[', push the current number and string onto their respective stacks and reset them.
// // 5. If the character is ']', pop from both stacks, repeat the current string, and append it to the previous string.
// // 6. If the character is a letter, append it to the current string.
