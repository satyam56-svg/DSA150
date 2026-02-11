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

    // recursive approach
    public static Node revRec(Node head) {
        if(head==null || head.next==null) {
            return head; // Base case: empty list or single node
        }
        Node newHead=revRec(head.next); // Reverse the rest of the list
        head.next.next=head; // Make the next node point to the current node
        head.next=null; // Set the current node's next to null
        return newHead; // Return the new head of the reversed list
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
        // Linked List create
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        // Reverse the linked list
        head = revIter(head);

        System.out.println("Reversed list:");
        printList(head);
    }
}
