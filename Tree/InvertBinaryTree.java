// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InvertBinaryTree {

    // Function to invert the binary tree
    static TreeNode invertTree(TreeNode root) {
        if (root == null) return root; // base case

        // Swap left and right subtrees using recursion
        TreeNode l = root.left;
        TreeNode r = root.right;

        root.left = invertTree(r);
        root.right = invertTree(l);

        return root;
    }

    // Helper function to print tree in inorder traversal
    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        // Create the binary tree:
        //         4
        //        / \
        //       2   7
        //      / \ / \
        //     1  3 6  9
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.print("Original Tree (Inorder): ");
        inorder(root);

        // Invert the tree
        root = invertTree(root);

        System.out.print("\nInverted Tree (Inorder): ");
        inorder(root);
    }
}

// steps:
// 1. invert the tree through invertTree(root)
// 2. if root==null return root
// 3. initilase TreeNode l with root.left
// 4. initilase TreeNode r with root.right
// 5. now put root.left=invertTree(r)
// 6. put root.right=invertTree(l)
// 7. recursively run kro jb tk base case reach na ho jaye
// 8. simply last me root return krdo