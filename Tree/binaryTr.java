import java.util.*;

public class binaryTr {

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
    static int height(TreeNode root) { // recursive fun to find the height of Tree
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


// STEP:
/*
1. create double array list(result) create kro jo value store kre levelOrder function ke
// levelOrder function ke andar
2. agr root null h to khali ArrayList return krdo
3. level ka value height(root)+1 ho // yha pr height fun tree ki height nikalne ke liye hota h
4. double array list create kro (ans)
5. for loop chlao i=1 se lekar i<=level tk 
6. ArrayList create kro arr naam se
7. ab fun nthLevel(root,i,arr) me chlo
8. agr root null ho to kuch mt kro simply return ho jao
9. agr n ka value 1 ho to arrayList me root ka value add kro aur return ho jao
10. hr ek step me do recursive function ko break kro
11. nthLevel(root.left,n-1,arr) aur nthLevel(root.right,n-1,arr)
12. recursion function khtm hone ke baad wapas levelOrder fun aao
13. ans(double arrList) me arr(single arrList) me add krdo
14. ans ko return krdo
*/