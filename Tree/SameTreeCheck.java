// // Definition for a binary tree node
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class SameTreeCheck {

//     // Function to check if two binary trees are the same
//     static boolean isSameTree(TreeNode p, TreeNode q) {
//         if (p == null && q == null) return true;       // dono null → same
//         if (p == null || q == null) return false;      // ek null hai → different
//         if (p.val != q.val) return false;              // value mismatch → different

//         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//     }

//     // Helper function to print tree inorder (optional)
//     static void inorder(TreeNode root) {
//         if (root != null) {
//             inorder(root.left);
//             System.out.print(root.val + " ");
//             inorder(root.right);
//         }
//     }

//     public static void main(String[] args) {
//         // Create Tree p:
//         //         1
//         //        / \
//         //       2   3
//         TreeNode p = new TreeNode(1);
//         p.left = new TreeNode(2);
//         p.right = new TreeNode(3);

//         // Create Tree q:
//         //         1
//         //        / \
//         //       2   3
//         TreeNode q = new TreeNode(1);
//         q.left = new TreeNode(2);
//         q.right = new TreeNode(3);

//         System.out.print("Inorder Traversal of Tree p: ");
//         inorder(p);
//         System.out.println();

//         System.out.print("Inorder Traversal of Tree q: ");
//         inorder(q);
//         System.out.println();

//         // Check if both trees are same
//         boolean result = isSameTree(p, q);
//         System.out.println("Are both trees the same? " + result);
//     }
// }
