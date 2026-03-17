// package Tree;
// import java.util.ArrayList;
// import java.util.Collections;

// public class binary_tree_to_bst {

//     public static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node binaryTreeToBST(Node root) {
//         // Your code here
//         ArrayList<Integer>list=new ArrayList<>();
//         inorderStore(root,list);
//         Collections.sort(list);
//         inorderFill(root,list,new int[]{0});
//         return root;
//     }
    
//     public static void inorderStore(Node root, ArrayList<Integer>list) {
//         if(root==null) return;
//         inorderStore(root.left,list);
//         list.add(root.data);
//         inorderStore(root.right,list);
//     }
    
//     public static void inorderFill(Node root, ArrayList<Integer>list, int idx[]) {
//         if(root==null) return;
//         inorderFill(root.left,list,idx);
//         root.data=list.get(idx[0]);
//         idx[0]++;
//         inorderFill(root.right,list,idx);
//     }

//     public static void preOrder(Node root) {
//         if(root == null)
//             return;

//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void main(String[] args) {
//         Node root = new Node(10);
//         root.left = new Node(30);
//         root.right = new Node(15);
//         root.left.left = new Node(20);
//         root.left.right = new Node(5);

//         binaryTreeToBST(root);
//         preOrder(root);
//     }
// }
