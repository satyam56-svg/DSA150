
public class merge_node_sort {

    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeSort(Node head) {
        // base case
        if(head == null || head.next == null) {
            return head;
        }
        
        // find middle
        Node mid = getMid(head);
        Node nextToMid = mid.next;
        
        mid.next = null; // break
        
        // recursive sort
        Node left = mergeSort(head);
        Node right = mergeSort(nextToMid);
        
        // merge
        return merge(left, right);
    }
    
    // function to find middle
    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // merge two sorted lists
    private static Node merge(Node a, Node b) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        
        while(a != null && b != null) {
            if(a.data <= b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        
        // remaining nodes
        if(a != null) temp.next = a;
        if(b != null) temp.next = b;
        
        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(38);
        head.next = new Node(27);
        head.next.next = new Node(43);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(82);
        head.next.next.next.next.next.next = new Node(10);

        System.out.println("Original list:");
        printList(head);

        head = mergeSort(head);

        System.out.println("Sorted list:");
        printList(head);
    }
}
