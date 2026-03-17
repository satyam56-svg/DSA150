// public class largest_swap {
//     public static String largestSwap(String s) {
//         char[] arr = s.toCharArray();
//         int[] last = new int[10];

//         for(int i = 0; i < arr.length; i++)
//             last[arr[i] - '0'] = i;

//         for(int i = 0; i < arr.length; i++) {
//             for(int d = 9; d > arr[i] - '0'; d--) {
//                 if(last[d] > i) {
//                     char t = arr[i];
//                     arr[i] = arr[last[d]];
//                     arr[last[d]] = t;
//                     return new String(arr);
//                 }
//             }
//         }
//         return s;
//     }

//     public static void main(String[] args) {
//         String s = "2736";
//         System.out.println(largestSwap(s));
//     }
// }
