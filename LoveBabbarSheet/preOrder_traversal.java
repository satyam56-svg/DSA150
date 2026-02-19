import java.util.ArrayList;
import java.util.List;

public class preOrder_traversal {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer>list=new ArrayList<>();
        pre(root,list);
        return list;
    }

    public static void pre(Node root, List<Integer>ans) {
        if(root==null) return;
        ans.add(root.data);
        pre(root.left,ans);
        pre(root.right,ans);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = preOrder(root);
        System.out.println(result); // Output: [1, 2, 4, 5, 3]
    }
}