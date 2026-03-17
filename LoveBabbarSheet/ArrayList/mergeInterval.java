// package ArrayList;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class mergeInterval {
//     public static ArrayList<int[]> mergeOverlap(int[][] arr) {
//         // Code here
//         if (arr == null || arr.length <= 1) {
//             return new ArrayList<>(Arrays.asList(arr));
//         }

//         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

//         ArrayList<int[]> result = new ArrayList<>();
//         result.add(arr[0]);

//         for (int i = 1; i < arr.length; i++) {
//             int last[] = result.get(result.size() - 1);
//             if (arr[i][0] <= last[1]) {
//                 last[1] = Math.max(last[1], arr[i][1]);
//             } else {
//                 result.add(arr[i]);
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int intervals[][] = { {1,3}, {2,4}, {5,7}, {6,8} };

//         ArrayList<int[]> mergedIntervals = mergeOverlap(intervals);

//         for (int[] interval : mergedIntervals) {
//             System.out.println("[" + interval[0] + ", " + interval[1] + "]");
//         }
//     }
// }
