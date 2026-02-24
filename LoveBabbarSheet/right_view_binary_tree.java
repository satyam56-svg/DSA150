import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class right_view_binary_tree {

    public static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size=q.size();
            for(int i=0; i<size; i++) {
                Node curr=q.poll();
                if(i==size-1) {
                    ans.add(curr.data);
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        ArrayList<Integer> rightViewNodes = rightView(root);
        System.out.println("Right View of the Binary Tree: " + rightViewNodes);
    }
}
