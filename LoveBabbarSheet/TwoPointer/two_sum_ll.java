// import java.util.ArrayList;

// public class two_sum_ll {

//     public static class Node {
//         int data;
//         Node next;
//         Node prev;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

//         Node first = head;
//         Node last = head;

//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//         // move last to tail
//         while(last.next != null) {
//             last = last.next;
//         }

//         while(first != last && last.next != first) {

//             int sum = first.data + last.data;

//             if(sum == target) {

//                 ArrayList<Integer> ans = new ArrayList<>();
//                 ans.add(first.data);
//                 ans.add(last.data);
//                 list.add(ans);

//                 first = first.next;
//                 last = last.prev;
//             }

//             else if(sum < target) {
//                 first = first.next;
//             }

//             else {
//                 last = last.prev;
//             }
//         }

//         return list;
//     }


//     public static void main(String[] args) {

//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         Node fourth = new Node(4);
//         Node fifth = new Node(5);

//         head.next = second;
//         second.prev = head;

//         second.next = third;
//         third.prev = second;

//         third.next = fourth;
//         fourth.prev = third;

//         fourth.next = fifth;
//         fifth.prev = fourth;

//         int target = 5;

//         ArrayList<ArrayList<Integer>> res = findPairsWithGivenSum(target, head);

//         for (ArrayList<Integer> pair : res) {
//             System.out.println(pair);
//         }
//     }
// }
