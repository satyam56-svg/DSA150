package LinkedList;
public class remove_nth_node_from_end_in_linked_list {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // public ListNode reverse(ListNode head) {
    // ListNode prev = null, curr = head;
    // while (curr != null) {
    // ListNode agla = curr.next; // Store next node
    // curr.next = prev; // Reverse pointer
    // prev = curr; // Move prev forward
    // curr = agla; // Move curr forward
    // }
    // return prev; // New head after reverse
    // }

    // // Delete the nth node starting from head (1-indexed)
    // public ListNode delete(ListNode head, int n) {
    // // Agar n=1 matlab pehli node delete karni hain
    // if (n == 1) {
    // return head.next; // Head skip kar do, dusra node new head
    // }

    // ListNode temp = head;
    // // Move (n-2) times to reach node just before the one to delete
    // for (int i = 1; i < n - 1; i++) {
    // temp = temp.next;
    // }

    // // Skip the nth node
    // temp.next = temp.next.next;
    // return head;
    // }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // // Agar sirf ek node hai aur usi ko hataana hai
        // if (head.next == null && n == 1) {
        // return null;
        // }

        // // Step 1: Reverse the linked list
        // ListNode reversedList = reverse(head);

        // // Step 2: Delete the nth node from start (which is nth from end in original
        // list)
        // ListNode afterDeletion = delete(reversedList, n);

        // // Step 3: Reverse the list again to restore original order (without the
        // deleted node)
        // return reverse(afterDeletion);

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // Agar fast null ho gaya to matlab head ko delete karna hai
        if (fast == null) {
            // Head ko skip karo, dusra node naya head
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Remove 2nd node from end
        ListNode updatedHead = removeNthFromEnd(head, n);

        // Print updated list
        ListNode current = updatedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

// to find: remove nth node from end in linked list java
// steps:
// 1. Use two pointers, fast and slow, both starting at head.
// 2. Move the fast pointer n steps ahead.
// 3. If fast becomes null, remove the head node.
// 4. Move both pointers until fast reaches the end.
// 5. Remove the node after the slow pointer.
// time complexity: O(L) where L is the length of the linked list.
// space complexity: O(1) as we are using constant extra space.