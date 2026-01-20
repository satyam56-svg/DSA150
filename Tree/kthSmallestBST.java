import java.util.*;

public class kthSmallestBST {

    // 🔹 TreeNode structure
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    // 🔹 global variables
    static int count = 0;
    static int ans = 0;

    // 🔹 Function to find kth smallest
    static int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }

    // 🔹 Inorder traversal (sorted order)
    static void inorder(TreeNode root, int k) {
        if (root == null) return;

        inorder(root.left, k);

        count++;
        if (count == k) {
            ans = root.val;
            return;
        }

        inorder(root.right, k);
    }

    // 🔹 main function (example run)
    public static void main(String[] args) {
        /*
                  5
                 / \
                3   6
               / \
              2   4
             /
            1
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        int k = 3;
        System.out.println("Kth Smallest Element (" + k + "): " + kthSmallest(root, k));
    }
}
