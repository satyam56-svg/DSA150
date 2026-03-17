// package Stack;
// import java.util.Stack;

// public class insert_at_bottom {
//     public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
//         Stack<Integer>temp=new Stack<>();
//         while(!st.isEmpty()) {
//             temp.push(st.pop());
//         }
//         st.push(x);
//         while(!temp.isEmpty()) {
//             st.push(temp.pop());
//         }
//         return st;
//     }

//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(1);
//         st.push(2);
//         st.push(3);

//         System.out.println("Before inserting at bottom: " + st);
//         st = insertAtBottom(st, 0);
//         System.out.println("After inserting at bottom: " + st);
//     }
// }
