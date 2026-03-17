// package Tree;
// public class minVal_BST {

//     public static class Node {
//         int data;
//         Node left;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//         }
//     }

//     public static int minValue(Node root) {

//         if(root == null)
//             return -1;   // edge case

//         while(root.left != null) {
//             root = root.left;
//         }

//         return root.data;
//     }

//     public static void main(String[] args) {
//         Node root = new Node(10);
//         root.left = new Node(5);
//         root.left.left = new Node(3);
//         int minValue = minValue(root);
//         System.out.println("Minimum value in the BST: " + minValue);
//     }
// }
