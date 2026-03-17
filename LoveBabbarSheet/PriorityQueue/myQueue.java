// public class myQueue {

//     static int arr[];
//     static int front;
//     static int rear;
//     static int size;

//     public myQueue(int n) {
//         arr = new int[n];
//         size = n;
//         front = -1;
//         rear = -1;
//     }

//     public static boolean isEmpty() {
//         return front == -1;
//     }

//     public static boolean isFull() {
//         return (rear + 1) % size == front;
//     }

//     public static void enqueue(int x) {

//         if(isFull()) {
//             return;
//         }

//         if(front == -1) {
//             front = 0;
//         }

//         rear = (rear + 1) % size;
//         arr[rear] = x;
//     }

//     public static void dequeue() {

//         if(isEmpty()) {
//             return;
//         }

//         if(front == rear) {
//             front = -1;
//             rear = -1;
//             return;
//         }

//         front = (front + 1) % size;
//     }

//     public static int getFront() {
//         if(isEmpty()) return -1;
//         return arr[front];
//     }

//     public static int getRear() {
//         if(isEmpty()) return -1;
//         return arr[rear];
//     }

//     @SuppressWarnings("static-access")
//     public static void main(String[] args) {
//         myQueue q = new myQueue(5);
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         q.enqueue(4);
//         q.enqueue(5);

//         System.out.println(q.getFront()); // Output: 1
//         System.out.println(q.getRear());  // Output: 5

//         q.dequeue();
//         System.out.println(q.getFront()); // Output: 2
//     }
// }
