// public class mirror_tree {

//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static void mirror(Node root) {
//         // code here
//         if(root==null) return;
//         Node temp=root.left;
//         root.left=root.right;
//         root.right=temp;
        
//         mirror(root.left);
//         mirror(root.right);
//     }

//     public static void main(String[] args) {
//         Node rootNode = new Node(1);
//         rootNode.left = new Node(2);
//         rootNode.right = new Node(3);
//         rootNode.left.left = new Node(4);
//         rootNode.left.right = new Node(5);
//         inOrder(rootNode);
//         mirror(rootNode);
//         System.out.println();
//         inOrder(rootNode);
//     }

//     private static void inOrder(mirror_tree.Node rootNode) {
//         if(rootNode==null) return;
//         inOrder(rootNode.left);
//         System.out.print(rootNode.data + " ");
//         inOrder(rootNode.right);
//     }
// }
