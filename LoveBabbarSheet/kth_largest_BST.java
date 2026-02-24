public class kth_largest_BST {
    static int count = 0;
    static int ans = -1;

    public static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static int kthLargest(Node root, int k) {
        count = 0;
        ans = -1;
        reverseInorder(root, k);
        return ans;
    }

    public static void reverseInorder(Node root, int k) {

        if(root == null)
            return;

        reverseInorder(root.right, k);

        count++;
        if(count == k) {
            ans = root.data;
            return;
        }

        reverseInorder(root.left, k);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(8);

        int k = 3;
        int kthLargestValue = kthLargest(root, k);
        System.out.println(k + "rd largest value in the BST: " + kthLargestValue);
    }
}
