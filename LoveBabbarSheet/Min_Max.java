// package LoveBabbarSheet;

// import java.util.ArrayList;

// public class Min_Max {
//     public static ArrayList<Integer> getMinMax(int[] arr) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(getMin(arr));
//         list.add(getMax(arr));
//         return list;
//     }

//     public static int getMin(int arr[]) {
//         int min = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     public static int getMax(int arr[]) {
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 5, 1, 8, -2, 7};
//         ArrayList<Integer> result = getMinMax(arr);
//         System.out.println("Min: " + result.get(0));
//         System.out.println("Max: " + result.get(1));
//     }
// }
