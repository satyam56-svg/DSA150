// package LinkedList;
// public class get_kth_node_from_last {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static int getKthFromLast(Node head, int k) {
//         int len=0;
//         Node temp=head;
//         while(temp!=null) {
//             len++;
//             temp=temp.next;
//         }
        
//         if(len<k) return -1;
        
//         temp=head;
//         int i=0;
//         while(i<len-k) {
//             temp=temp.next;
//             i++;
//         }
        
//         return temp.data;
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);

//         int k = 2;
//         int result = getKthFromLast(head, k);
//         System.out.println(result); // Output: 4
//     }
// }
