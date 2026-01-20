package LinkedList;
public class merge_linked_list {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;   
        ListNode temp2=list2;   

        ListNode head=new ListNode(0);  
        ListNode temp=head; 

        while(temp1!=null && temp2!=null) {     
            if(temp1.val<temp2.val) {   
                temp.next=temp1;    
                temp=temp1;     
                temp1=temp1.next;   
            } else {    
                temp.next=temp2;    
                temp=temp2;   
                temp2=temp2.next;
            }
        }

        if(temp1!=null) {   
            temp.next=temp1;    
        } else {
            temp.next=temp2;    
        }

        return head.next;   
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        merge_linked_list mll = new merge_linked_list();
        ListNode list1 = mll.new ListNode(1, mll.new ListNode(2, mll.new ListNode(4)));
        ListNode list2 = mll.new ListNode(1, mll.new ListNode(3, mll.new ListNode(4)));

        System.out.println("List 1:");
        mll.printList(list1);
        System.out.println("List 2:");
        mll.printList(list2);

        ListNode mergedList = mll.mergeTwoLists(list1, list2);
        System.out.println("Merged List:");
        mll.printList(mergedList);
    }
}

// STEPS:
// 1. create two pointers for list1 & list2
// 2. create a head node with val:0
// 3. create a pointer(temp) with value head
// 4. run a while loop(agr dono pointers ka value null na ho)
// 5. compares values, link the smaller node, move the pointer of the merged list, move the pointer of list1
// 6. if list2 node is smaller or equal, link the smaller node, move the pointer of the merged list, move the pointer of list2
// 7. if list1 still has nodes, link the remaining nodes of list1
// 8. if list2 still has nodes, link them
// 9. return the merged list, skipping the dummy head