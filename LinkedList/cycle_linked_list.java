package LinkedList;
public class cycle_linked_list {

    public static class ListNode {
        ListNode next;
        ListNode(int val) {}
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;     
        ListNode fast=head;    

        while(fast!=null && fast.next!=null) { 
            slow=slow.next; 
            fast=fast.next.next;    
            if(fast==slow) {    
                return true; 
            }
        }
        return false;   
    }

    public static void main(String[] args) {
        // Example usage
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle

        System.out.println(hasCycle(node1)); // Output: true

        // Test with no cycle
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        node5.next = node6;

        System.out.println(hasCycle(node5)); // Output: false
    }
}

// STEPS:
// 1. Initialse slow and fast pointer with head value
// 2. check if fast pointer and its next pointer are not null
// 3. move slow pointer by one step
// 4. move fast pointer by two step
// 5. if slow & fast pointers meet, there is a cycle
// 6. cycle detected
// 7. if we reach here, no cycle exists..