
public class multiply_LL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static long multiplyTwoLists(Node first, Node second) {

        long mod = 1000000007;

        long num1 = 0;
        long num2 = 0;

        // first list ka number banao
        Node temp = first;
        while(temp != null) {
            num1 = (num1 * 10 + temp.data) % mod;
            temp = temp.next;
        }

        // second list ka number banao
        temp = second;
        while(temp != null) {
            num2 = (num2 * 10 + temp.data) % mod;
            temp = temp.next;
        }

        // multiply with modulo
        return (num1 * num2) % mod;
    }

    public static void main(String[] args) {
        // Example usage
        Node first = new Node(3);
        first.next = new Node(4);
        first.next.next = new Node(2);

        Node second = new Node(4);
        second.next = new Node(6);

        long result = multiplyTwoLists(first, second);
        System.out.println("Product of the two linked lists: " + result);
    }
}
