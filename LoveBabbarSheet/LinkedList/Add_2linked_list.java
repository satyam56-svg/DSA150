// package LinkedList;
// // package TwoPointer;

// // public class Add_2linked_list {

// //     public static class Node {
// //         int data;
// //         Node next;
        
// //         Node(int data) {
// //             this.data = data;
// //             this.next = null;
// //         }
// //     }

// //     public static Node reverse(Node head){
// //         Node prev = null;
// //         Node curr = head;
        
// //         while(curr != null){
// //             Node next = curr.next;
// //             curr.next = prev;
// //             prev = curr;
// //             curr = next;
// //         }
        
// //         return prev;
// //     }
    
// //     public static Node removeZero(Node head){
// //         while(head != null && head.data == 0){
// //             head = head.next;
// //         }
// //         return head;
// //     }
    
// //     public static Node addTwoLists(Node head1, Node head2) {
        
// //         head1 = removeZero(head1);
// //         head2 = removeZero(head2);
        
// //         head1 = reverse(head1);
// //         head2 = reverse(head2);
        
// //         Node dummy = new Node(0);
// //         Node curr = dummy;
// //         int carry = 0;
        
// //         while(head1 != null || head2 != null || carry != 0){
            
// //             int sum = carry;
            
// //             if(head1 != null){
// //                 sum += head1.data;
// //                 head1 = head1.next;
// //             }
            
// //             if(head2 != null){
// //                 sum += head2.data;
// //                 head2 = head2.next;
// //             }
            
// //             carry = sum / 10;
            
// //             curr.next = new Node(sum % 10);
// //             curr = curr.next;
// //         }
        
// //         return reverse(dummy.next);
// //     }

// //     public static void printList(Node head) {
// //         while(head != null) {
// //             System.out.print(head.data + " ");
// //             head = head.next;
// //         }
// //         System.out.println();
// //     }

// //     public static void main(String[] args) {
// //         Node head1 = new Node(0);
// //         head1.next = new Node(0);
// //         head1.next.next = new Node(1);
// //         head1.next.next.next = new Node(2);
        
// //         Node head2 = new Node(0);
// //         head2.next = new Node(3);
// //         head2.next.next = new Node(4);
        
// //         Node result = addTwoLists(head1, head2);
// //         printList(result); // Output: 4 6
// //     }
// // }
