// package Tree;
// public class balanced_tree {

//     public static class Node {
//         // int data;
//         Node left, right;

//         public Node(int item) {
//             // data = item;
//             left = right = null;
//         }
//     }

//     public static boolean isBalanced(Node root) {
//         // code here
//         if (root == null)
//             return true;

//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         if (Math.abs(leftHeight - rightHeight) > 1) {
//             return false;
//         }

//         return isBalanced(root.left) && isBalanced(root.right);
//     }

//     public static int height(Node root) {
//         if (root == null)
//             return 0;
//         return Math.max(height(root.left), height(root.right)) + 1;
//     }

//     public static void main(String[] args) {
//         // Example usage
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         System.out.println(isBalanced(root)); // Output: true
//     }
// }
