// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class subTree {

    // Function to check if subRoot is subtree of root
    static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;  // base case

        // If trees are same starting from current node
        if (isSameTree(root, subRoot)) return true;

        // Otherwise, check in left or right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Helper function to check if two trees are identical
    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // Inorder traversal to show structure
    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        // Create main tree (root):
        //         3
        //        / \
        //       4   5
        //      / \
        //     1   2
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // Create subtree (subRoot):
        //       4
        //      / \
        //     1   2
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        System.out.print("Inorder Traversal of Main Tree: ");
        inorder(root);
        System.out.println();

        System.out.print("Inorder Traversal of Sub Tree: ");
        inorder(subRoot);
        System.out.println();

        // Check if subRoot is subtree of root
        boolean result = isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + result);
    }
}
