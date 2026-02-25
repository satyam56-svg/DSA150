public class same_level {
    static int leafLevel=-1;

    public static class Node {
        // int data;
        Node left, right;

        public Node(int data) {
            // this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static boolean check(Node root) {
        // Your code here
        leafLevel=-1;
        return solve(root,0);
    }
    
    public static boolean solve(Node root, int level) {
        if(root==null) return true;
        if(root.left==null && root.right==null) {
            if(leafLevel==-1) {
                leafLevel=level;
                return true;
            }
            return level==leafLevel;
        }
        return solve(root.left,level+1) && solve(root.right,level+1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(check(root));
    }
}
