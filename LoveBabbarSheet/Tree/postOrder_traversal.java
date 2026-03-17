// import java.util.ArrayList;
// import java.util.List;

// public class postOrder_traversal {
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

//     public static ArrayList<Integer> postOrder(Node root) {
//         ArrayList<Integer>list=new ArrayList<>();
//         post(root,list);
//         return list;
//     }

//     public static void post(Node root, List<Integer>ans) {
//         if(root==null) return;
//         post(root.left,ans);
//         post(root.right,ans);
//         ans.add(root.data);
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         ArrayList<Integer> result = postOrder(root);
//         System.out.println(result); // Output: [4, 5, 2, 3, 1]
//     }
// }
