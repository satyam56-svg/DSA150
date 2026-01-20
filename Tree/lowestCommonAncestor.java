class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class lowestCommonAncestor {

    public static TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor1(root.left, p, q);
        TreeNode right = lowestCommonAncestor1(root.right, p, q);

        if (left != null && right != null) return root;  // p & q lie on both sides
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        // 🌳 Constructing the tree:
        //         3
        //        / \
        //       5   1
        //      / \  / \
        //     6  2 0  8
        //       / \
        //      7   4

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Example 1: p = 5, q = 1
        TreeNode p = root.left;     // 5
        TreeNode q = root.right;    // 1
        TreeNode ans1 = lowestCommonAncestor1(root, p, q);
        System.out.println("LCA of 5 and 1: " + ans1.val);

        // Example 2: p = 5, q = 4
        TreeNode p2 = root.left;                    // 5
        TreeNode q2 = root.left.right.right;        // 4
        TreeNode ans2 = lowestCommonAncestor1(root, p2, q2);
        System.out.println("LCA of 5 and 4: " + ans2.val);

        // Example 3: p = 7, q = 4
        TreeNode p3 = root.left.right.left;         // 7
        TreeNode q3 = root.left.right.right;        // 4
        TreeNode ans3 = lowestCommonAncestor1(root, p3, q3);
        System.out.println("LCA of 7 and 4: " + ans3.val);
    }
}
