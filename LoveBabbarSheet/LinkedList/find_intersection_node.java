// package LinkedList;
// public class find_intersection_node {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node findIntersection(Node head1, Node head2) {

//         Node p1 = head1;
//         Node p2 = head2;

//         Node dummy = new Node(0);
//         Node tail = dummy;

//         while(p1 != null && p2 != null) {

//             if(p1.data == p2.data) {

//                 tail.next = new Node(p1.data);
//                 tail = tail.next;

//                 p1 = p1.next;
//                 p2 = p2.next;
//             }
//             else if(p1.data < p2.data) {
//                 p1 = p1.next;
//             }
//             else {
//                 p2 = p2.next;
//             }
//         }

//         return dummy.next;
//     }

//     public static void main(String[] args) {
//         find_intersection_node obj = new find_intersection_node();

//         Node head1 = new Node(1);
//         head1.next = new Node(2);
//         head1.next.next = new Node(3);
//         head1.next.next.next = new Node(4);

//         Node head2 = new Node(3);
//         head2.next = new Node(4);
//         head2.next.next = new Node(5);

//         Node intersectionHead = obj.findIntersection(head1, head2);

//         System.out.println("Intersection of the two linked lists:");
//         while(intersectionHead != null) {
//             System.out.print(intersectionHead.data + " ");
//             intersectionHead = intersectionHead.next;
//         }
//     }
// }
