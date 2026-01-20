package LinkedList;
public class rev_linked_list {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node revIter(Node head) {
        Node prev=null,agla;
        Node curr=head;
        while(curr!=null) {
            agla=curr.next; // Store the next node
            curr.next=prev; // Reverse the link
            prev=curr; // Move prev to current node
            curr=agla; // Move to the next node
        }
        return prev; // Return the new head of the reversed list
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);
        head = revIter(head);
        System.out.println("Reversed Linked List:");
        printList(head);
    }
}

// to find: reverse linked list java
// steps:
// 1. Initialize three pointers: prev as null, curr as head, and agla (next) as null.
// 2. Iterate through the linked list and for each node:
//    a. Store the next node in agla.
//    b. Reverse the current node's pointer to point to prev.
//    c. Move prev and curr one step forward.
// 3. Return prev as the new head of the reversed linked list.
// time complexity: O(N) where N is the number of nodes in the linked list.
// space complexity: O(1) as we are using constant extra space.