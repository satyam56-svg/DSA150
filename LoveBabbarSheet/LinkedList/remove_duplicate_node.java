public class remove_duplicate_node {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node removeDuplicates(Node head) {
        // Your code here
        Node temp=head;
        while(temp!=null && temp.next!=null) {
            while(temp.next!=null && temp.data==temp.next.data) {
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        head = removeDuplicates(head);

        // Print the linked list after removing duplicates
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // Output: 1 2 3
    }
}
