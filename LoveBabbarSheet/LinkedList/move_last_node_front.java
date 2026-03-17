// public class move_last_node_front {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node moveToFront(Node head) {
//         // edge cases
//         if (head == null || head.next == null) {
//             return head;
//         }
//         Node temp = head;
//         Node prev = null;

//         while (temp.next != null) {
//             prev = temp;
//             temp = temp.next;
//         }
//         temp.next = head;
//         head = temp;
//         if (prev != null) {
//             prev.next = null;
//         }

//         return head;
//     }

//     public static void printList(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }   

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);

//         System.out.println("Original list:");
//         printList(head);

//         head = moveToFront(head);

//         System.out.println("List after moving last node to front:");
//         printList(head);
//     }
// }
