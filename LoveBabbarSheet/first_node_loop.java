
public class first_node_loop {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int cycleStart(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        boolean loop=false;
        
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                loop=true;
                break;
            }
        }
        
        if(!loop) return -1;
        
        slow=head;
        while(slow!=fast) {
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2); 
        head.next.next = new Node(3); 
        head.next.next.next = new Node(4); 
        head.next.next.next.next = new Node(5); 
        head.next.next.next.next.next = head.next; 
        int result = cycleStart(head); System.out.println("The starting node of the loop is: " + result);
    }
}