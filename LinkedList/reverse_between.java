public class reverse_between {

    // Make ListNode static
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Reverse nodes between left and right positions
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Move prev to (left - 1) position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null;

        // Reverse between left and right
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {

        // Creating list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1,
                          new ListNode(2,
                          new ListNode(3,
                          new ListNode(4,
                          new ListNode(5)))));

        int left = 1;
        int right = 3;

        System.out.print("Original List: ");
        printList(head);

        head = reverseBetween(head, left, right);

        System.out.print("After Reverse:  ");
        printList(head);
    }
}

// to find: find reverse between in linked list java
// steps:
// 1. Create a dummy node to handle edge cases.
// 2. Move a pointer to the node just before the left position.
// 3. Reverse the sublist between left and right positions.
// 4. Reconnect the reversed sublist back to the main list.
// 5. Return the modified list starting from the dummy's next node.
// time complexity: O(N) where N is the number of nodes in the linked list.
// space complexity: O(1) as we are using constant extra space.