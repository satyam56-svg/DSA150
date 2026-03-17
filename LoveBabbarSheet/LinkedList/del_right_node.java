// package LinkedList;
// public class del_right_node {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node reverse(Node head) {

//         Node prev = null;
//         Node curr = head;

//         while(curr != null) {
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         return prev;
//     }

//     public static Node compute(Node head) {

//         // step 1: reverse
//         head = reverse(head);

//         Node curr = head;
//         int max = curr.data;

//         while(curr != null && curr.next != null) {

//             if(curr.next.data < max) {
//                 // delete node
//                 curr.next = curr.next.next;
//             } else {
//                 curr = curr.next;
//                 max = curr.data;
//             }
//         }

//         // step 3: reverse again
//         head = reverse(head);

//         return head;
//     }

//     public static void printList(Node head) {
//         Node temp = head;
//         while(temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node head = new Node(12);
//         head.next = new Node(15);
//         head.next.next = new Node(10);
//         head.next.next.next = new Node(11);
//         head.next.next.next.next = new Node(5);
//         head.next.next.next.next.next = new Node(6);
//         head.next.next.next.next.next.next = new Node(2);
//         head.next.next.next.next.next.next.next = new Node(3);

//         System.out.println("Original list:");
//         printList(head);

//         head = compute(head);

//         System.out.println("Modified list:");
//         printList(head);
//     }
// }
