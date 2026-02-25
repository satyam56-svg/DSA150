import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class rev_level_order {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> reverseLevelOrder(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            stack.push(curr.data);

            if (curr.right != null)
                queue.offer(curr.right);
            if (curr.left != null)
                queue.offer(curr.left);
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = reverseLevelOrder(root);
        System.out.println(result);
    }
}
