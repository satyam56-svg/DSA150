// // Definition for a binary tree node
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class MaxDepthBinaryTree {

//     // Function to find maximum depth of binary tree
//     static int maxDepth(TreeNode root) {
//         if (root == null)
//             return 0; // base case
//         return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//     }

//     // Helper function to print tree in inorder traversal (optional)
//     static void inorder(TreeNode root) {
//         if (root != null) {
//             inorder(root.left);
//             System.out.print(root.val + " ");
//             inorder(root.right);
//         }
//     }

//     public static void main(String[] args) {
//         // Create the binary tree:
//         //         3
//         //        / \
//         //       9   20
//         //           / \
//         //          15  7
//         TreeNode root = new TreeNode(3);
//         root.left = new TreeNode(9);
//         root.right = new TreeNode(20);
//         root.right.left = new TreeNode(15);
//         root.right.right = new TreeNode(7);

//         System.out.print("Inorder Traversal of Tree: ");
//         inorder(root);

//         int depth = maxDepth(root);
//         System.out.println("\nMaximum Depth of Tree: " + depth);
//     }
// }
