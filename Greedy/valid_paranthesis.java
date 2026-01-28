// import java.util.Stack;

// public class valid_paranthesis {
//     public static boolean checkValidString(String s) {
//         Stack<Integer>left=new Stack<>();
//         Stack<Integer>star=new Stack<>();
//         for(int i=0; i<s.length(); i++) {
//             if(s.charAt(i)=='(') {
//                 left.push(i);
//             } else if(s.charAt(i)=='*') {
//                 star.push(i);
//             } else {
//                 if(!left.isEmpty()) {
//                     left.pop();
//                 } else if(!star.isEmpty()) {
//                     star.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         while(!left.isEmpty() && !star.isEmpty()) {
//             int leftIdx=left.pop();
//             int starIdx=star.pop();
//             if(leftIdx>starIdx) return false;
//         }

//         return left.isEmpty();
//     }

//     public static void main(String[] args) {
//         String s="(*))";
//         System.out.println(checkValidString(s));
//     }
// }

// // to find: whether the given string containing '(', ')' and '*' is valid or not'*' can be treated as '(', ')' or an empty string

// // steps:
// // 1. Create two stacks to store the indices of '(' and '*' characters.
// // 2. Traverse the string character by character.
// //    - If the character is '(', push its index onto the left stack.
// //    - If the character is '*', push its index onto the star stack.
// //    - If the character is ')', check if there is a matching '(' in the left stack. If so, pop it. If not, check the star stack. If neither stack has a matching character, return false.
// // 3. After processing all characters, there may still be unmatched '(' in the left stack.
// //    - For each unmatched '(', check if there is a '*' in the star stack that
// //      appears after it (i.e., has a higher index). If so, pop both stacks.
// //    - If there is an unmatched '(' that cannot be matched with a '*', return false.
// // 4. If all '(' are matched, return true; otherwise, return false.
// // time complexity: O(n)
// // space complexity: O(n)

