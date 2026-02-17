public class split_list {

    public static class Pair<T, U> {
        public final T first;
        public final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Pair<Node, Node> splitList(Node head) {

        if(head == null) return null;

        Node slow = head;
        Node fast = head;

        // find middle
        while(fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // even nodes case
        if(fast.next.next == head) {
            fast = fast.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        // make first half circular
        slow.next = head1;

        // make second half circular
        fast.next = head2;

        return new Pair<>(head1, head2);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // Making the list circular

        Pair<Node, Node> result = splitList(head);

        // Print the first half
        System.out.println("First half:");
        Node temp = result.first;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != result.first);
        System.out.println();

        // Print the second half
        System.out.println("Second half:");
        temp = result.second;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != result.second);
    }
}
