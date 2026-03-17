// import java.util.*;

// public class twoSum {
//     public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         HashSet<Integer> seen = new HashSet<>();
//         HashSet<Integer> used = new HashSet<>();

//         for (int num : arr) {
//             if (seen.contains(-num) && !used.contains(Math.abs(num))) {
//                 ArrayList<Integer> pair = new ArrayList<>();
//                 pair.add(Math.min(num, -num));
//                 pair.add(Math.max(num, -num));
//                 list.add(pair);
//                 used.add(Math.abs(num)); // mark this pair as used
//             } else {
//                 seen.add(num);
//             }
//         }

//         // Sort by first element of each pair
//         Collections.sort(list, (a, b) -> a.get(0) - b.get(0));
//         return list;
//     }

//     public static void main(String[] args) {
//         int[] arr = {
//             856, -723, -114, 723, -559, 547, 364, -960, -968, -785, 851, 125,
//             -691, 677, 732, -169, 963, -388, 272, -897, 622, -54, -203, 473,
//             731, 261, 699, 90, -736, -770, -801, -435, 943, -736, -75, -737,
//             -997, 324, 107, -962, -175, -655, 422, -842, 328, -840, 840, -588,
//             588, -561, 561, -497, 497, -261, 261, -238, 238, -170, 170, -137,
//             137, -113, 113, -7, 7
//         };

//         ArrayList<ArrayList<Integer>> result = getPairs(arr);
//         for (ArrayList<Integer> pair : result) {
//             System.out.println(pair.get(0) + " " + pair.get(1));
//         }
//     }
// }

