

public class remove_loop {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void removeLoop(Node head) {
        // code here
        if(head==null || head.next==null) return;
        Node slow=head;
        Node fast=head;
        
        boolean loopExist=false;
        
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast) {
                loopExist=true;
                break;
            }
        }
        
        if(!loopExist) return;
        
        slow=head;
        while(slow!=fast) {
            slow=slow.next;
            fast=fast.next;
        }
        
        while(fast.next!=slow) {
            fast=fast.next;
        }
        
        fast.next=null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next; // Creating a loop

        removeLoop(head);

        // Print the list to verify loop is removed
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
