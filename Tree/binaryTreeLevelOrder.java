import java.util.*;

public class binaryTreeLevelOrder {

    // TreeNode class definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    // 🔹 height function
    static int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // 🔹 nthLevel function (to collect all nodes at level n)
    static void nthLevel(TreeNode root, int n, List<Integer> arr) {
        if (root == null) return;
        if (n == 1) {
            arr.add(root.val);
            return;
        }
        nthLevel(root.left, n - 1, arr);
        nthLevel(root.right, n - 1, arr);
    }

    // 🔹 main levelOrder function
    static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        int level = height(root) + 1;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= level; i++) {
            List<Integer> arr = new ArrayList<>();
            nthLevel(root, i, arr);
            ans.add(arr);
        }
        return ans;
    }

    // 🔹 main function (example run)
    public static void main(String[] args) {
        // Example Tree:
        //      3
        //     / \
        //    9  20
        //       / \
        //      15  7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);

        System.out.println("Level Order Traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}

//steps:
// 1. create a double array list (result) jo store kre fun(levelOrder) ko
// 2. agr root null ho to simply new ArrayList return krdo
// 3. initilase level=height(fun which is used to return height of the binary tree)
// 4. create a new single arrayList(arr)
// 5. use fun nthLevel(root,i,arr)
// 6. if root==null return;
// 7. if n==1 arr.add(root) then return
// 8. use fun nthLevel(root.left,n-1,arr)
// 9. use fun nthLevel(root.right,n-1,arr)
// 10. recursively fun ko run kro jb tk base case nn aajye
// 11. ans ko return krdo