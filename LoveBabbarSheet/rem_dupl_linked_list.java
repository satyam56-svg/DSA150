import java.util.HashSet;

public class rem_dupl_linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeDuplicates(Node head) {
        if(head==null) return head;
        HashSet<Integer>set=new HashSet<>();
        
        Node curr=head;
        Node prev=null;
        
        while(curr!=null) {
            if(set.contains(curr.data)) {
                prev.next=curr.next;
            } else {
                set.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
        }
        
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        head = removeDuplicates(head);

        // Print the linked list after removing duplicates
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
