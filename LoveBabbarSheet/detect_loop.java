public class detect_loop {

    public static class Node {
        // int data;
        Node next;

        Node(int d) {
            // data = d;
            next = null;
        }
    }

    public static boolean detectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        // IMPORTANT: fast ko check karo
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Linked List create
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Loop create (5 -> 3)
        head.next.next.next.next.next = head.next.next;

        // detect loop
        boolean ans = detectLoop(head);

        if(ans) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop");
        }
    }
}
