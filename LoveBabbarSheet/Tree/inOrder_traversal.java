// package Tree;
// import java.util.ArrayList;
// import java.util.List;

// public class inOrder_traversal {
//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static ArrayList<Integer> inOrder(Node root) {
//         ArrayList<Integer>list=new ArrayList<>();
//         in(root,list);
//         return list;
//     }

//     public static void in(Node root, List<Integer>ans) {
//         if(root==null) return;
//         in(root.left,ans);
//         ans.add(root.data);
//         in(root.right,ans);
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         ArrayList<Integer> result = inOrder(root);
//         System.out.println(result); // Output: [4, 2, 5, 1, 3]
//     }
// }
