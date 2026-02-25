public class transform_to_sum_tree {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void toSumTree(Node root) {
        convert(root);
    }

    // helper function jo subtree ka total sum return karega
    public static int convert(Node root) {

        // base case
        if(root == null)
            return 0;

        // left subtree sum
        int leftSum = convert(root.left);

        // right subtree sum
        int rightSum = convert(root.right);

        // old value store karo
        int oldValue = root.data;

        // current node update karo
        root.data = leftSum + rightSum;

        // total subtree sum return karo
        return oldValue + leftSum + rightSum;
    }

    public static void preOrder(Node root) {
        if(root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        toSumTree(root);

        System.out.println("Preorder traversal of the sum tree is:");
        preOrder(root);
    }
}