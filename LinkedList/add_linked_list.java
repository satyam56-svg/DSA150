package LinkedList;

public class add_linked_list {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 7 0 8
    }
}

// STEPS:
// 1. create a dummy node with value 0..
// 2. initilase current node with dummy node..
// 3. initialse carry with value 0
// 4. run a while loop with cond, l1!=null ya l2!=null ya carry>0 to,
// 5. initialse sum = carry
// 6. agr phela list null nhi h to
// 7. sum me list ki pheli value ko add kro
// 8. ab list ki dusri element pr jao
// 9. agr dusra list null nhi ho to
// 10. sum me list ki pheli value ko store kro
// 11. ab list ki dusri element me jao
// 12. ab carry nikalo sum ko 10 se divide krke
// 13. current next me nodebnao jiski value sum%10 ho
// 14. current ko bdha do
// 15. return krdo last me dummy.next ko