// import java.util.ArrayList;
// import java.util.Collections;

// public class merge_KSortedLinkedList {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node mergeKLists(Node[] arr) {

//         ArrayList<Integer> list = new ArrayList<>();

//         for (int i = 0; i < arr.length; i++) {
//             Node temp = arr[i];

//             while (temp != null) {
//                 list.add(temp.data);
//                 temp = temp.next;
//             }
//         }

//         Collections.sort(list);

//         Node head = null;
//         Node tail = null;

//         for (int i = 0; i < list.size(); i++) {
//             Node newNode = new Node(list.get(i));

//             if (head == null) {
//                 head = newNode;
//                 tail = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }

//         return head;
//     }

//     public static void printList(Node head) {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }

//     public static void main(String[] args) {

//         // List 1: 1 -> 4 -> 5
//         Node l1 = new Node(1);
//         l1.next = new Node(4);
//         l1.next.next = new Node(5);

//         // List 2: 1 -> 3 -> 4
//         Node l2 = new Node(1);
//         l2.next = new Node(3);
//         l2.next.next = new Node(4);

//         // List 3: 2 -> 6
//         Node l3 = new Node(2);
//         l3.next = new Node(6);

//         Node[] arr = {l1, l2, l3};

//         Node result = mergeKLists(arr);

//         printList(result);
//     }
// }