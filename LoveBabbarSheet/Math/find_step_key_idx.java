// package Math;
// public class find_step_key_idx {
//     public int findStepKeyIndex(int[] arr, int k, int x) {

//         int i = 0;
//         int n = arr.length;

//         while(i < n) {

//             if(arr[i] == x)
//                 return i;

//             int step = Math.abs(arr[i] - x) / k;

//             if(step == 0)
//                 step = 1;

//             i = i + step;
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         find_step_key_idx obj = new find_step_key_idx();
//         int[] arr = {1, 3, 5, 7, 9};
//         int k = 2;
//         int x = 5;
//         int index = obj.findStepKeyIndex(arr, k, x);
//         System.out.println("Index of " + x + ": " + index);
//     }
// }
