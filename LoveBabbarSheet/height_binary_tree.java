public class height_binary_tree {

    public static class Node {
        // int data;
        Node left;
        Node right;

        public Node(int data) {
            // this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int height(Node root) {

        if (root == null) {
            return -1;
        }

        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        height_binary_tree tree = new height_binary_tree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int height = tree.height(root);
        System.out.println("Height of the binary tree: " + height);
    }
}
