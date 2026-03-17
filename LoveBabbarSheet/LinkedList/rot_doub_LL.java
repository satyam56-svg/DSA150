
// public class rot_doub_LL {

//     public static class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node rotateDLL(Node head, int p) {

//         if(head == null || head.next == null || p == 0)
//             return head;

//         // length find karo
//         Node temp = head;
//         int len = 1;

//         while(temp.next != null) {
//             temp = temp.next;
//             len++;
//         }

//         // agar p length se bada ho
//         p = p % len;

//         if(p == 0)
//             return head;

//         // p-th node tak jao
//         Node curr = head;

//         for(int i = 1; i < p; i++) {
//             curr = curr.next;
//         }

//         Node newHead = curr.next;

//         // break list
//         curr.next = null;
//         newHead.prev = null;

//         // last node already temp me hai
//         temp.next = head;
//         head.prev = temp;

//         return newHead;
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
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.prev = head;
//         head.next.next = new Node(3);
//         head.next.next.prev = head.next;
//         head.next.next.next = new Node(4);
//         head.next.next.next.prev = head.next.next;
//         head.next.next.next.next = new Node(5);
//         head.next.next.next.next.prev = head.next.next.next;

//         System.out.println("Original list:");
//         printList(head);

//         int p = 2;
//         head = rotateDLL(head, p);

//         System.out.println("Rotated list:");
//         printList(head);
//     }
// }
