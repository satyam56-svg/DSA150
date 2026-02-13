public class circular_node {

    public static class Node {
        // int data;
        Node next;

        Node(int data) {
            // this.data = data;
            this.next = null;
        }
    }

    public static boolean isCircular(Node head) {
        // Your code here
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null) {
            fast=fast.next;
            if(slow==fast) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Creating a circular linked list

        System.out.println(isCircular(head)); // Output: true
    }
}
