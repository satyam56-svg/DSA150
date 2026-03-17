// import java.util.Arrays;
// import java.util.HashMap;

// public class min_swap_to_sort {
//     public static int minSwaps(int[] arr) {

//         int n = arr.length;
//         int[] sorted = arr.clone();
//         Arrays.sort(sorted);

//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i=0;i<n;i++){
//             map.put(arr[i], i);
//         }

//         int swaps = 0;

//         for(int i=0;i<n;i++){

//             if(arr[i] != sorted[i]){

//                 swaps++;

//                 int correct = sorted[i];
//                 int idx = map.get(correct);

//                 map.put(arr[i], idx);
//                 map.put(correct, i);

//                 int temp = arr[i];
//                 arr[i] = arr[idx];
//                 arr[idx] = temp;
//             }
//         }

//         return swaps;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 5, 4, 3, 2};
//         System.out.println(minSwaps(arr));
//     }
// }
