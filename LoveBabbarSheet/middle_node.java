public class middle_node {

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static int getMiddle(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow.data;
    }

    public static void main(String[] args) {

        // Linked List create
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int ans = getMiddle(head);

        System.out.println("Middle node data: " + ans);
    }
}
