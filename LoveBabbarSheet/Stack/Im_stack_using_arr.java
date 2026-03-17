// package Stack;
// public class Im_stack_using_arr {
//     public static class myStack {
//         int arr[];
//         int top;
//         int n;

//         public myStack(int n) {
//             // Define Data Structures
//             this.n = n;
//             arr = new int[n];
//             top = -1;
//         }

//         public boolean isEmpty() {
//             // check if the stack is empty
//             return top == -1;

//         }

//         public boolean isFull() {
//             // check if the stack is full
//             return top == n - 1;
//         }

//         public void push(int x) {
//             // Inserts x at the top of the stack
//             if (isFull())
//                 return;
//             arr[++top] = x;
//         }

//         public void pop() {
//             // Removes an element from the top of the stack
//             if (isEmpty())
//                 return;
//             top--;
//         }

//         public int peek() {
//             // Returns the top element of the stack
//             if (isEmpty())
//                 return -1;
//             return arr[top];
//         }
//     }

//     public static void main(String[] args) {
//         myStack s = new myStack(5);
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         System.out.println(s.peek()); // Output: 5

//         s.pop();
//         System.out.println(s.peek()); // Output: 4

//         s.pop();
//         System.out.println(s.peek()); // Output: 3
//     }
// }
