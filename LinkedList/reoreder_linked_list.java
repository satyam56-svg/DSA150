package LinkedList;
public class reoreder_linked_list {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null, agla;
        ListNode curr = head;
        while (curr != null) {
            agla = curr.next;    // Store the next node
            curr.next = prev;    // Reverse the link
            prev = curr;         // Move prev to current node
            curr = agla;         // Move to next node
        }
        return prev;             // Return the new head of reversed list
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find the middle of the linked list (slow & fast pointer)
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Split list into two halves and reverse second half
        ListNode second = slow.next;
        slow.next = null;        // Break the list into two parts
        second = reverse(second);

        // 3. Merge the two halves alternately
        ListNode first = head;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        reorderList(head);

        System.out.println("Reordered list:");
        printList(head);
    }
}

// to find: reorder linked list java
// steps:
// 1. Find the middle of the linked list using slow and fast pointers.
// 2. Reverse the second half of the linked list.
// 3. Merge the two halves alternately to achieve the desired order.
// time complexity: O(N) where N is the number of nodes in the linked list.
// space complexity: O(1) as we are using constant extra space.