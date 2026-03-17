// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;

// public class common_int_arr {
//     public static List<Integer> commonElements(List<Integer> arr1, 
//                                         List<Integer> arr2, 
//                                         List<Integer> arr3) {

//         HashSet<Integer> set1 = new HashSet<>();
//         HashSet<Integer> set2 = new HashSet<>();
//         List<Integer> result = new ArrayList<>();

//         // Step 1: arr1 ke elements set1 me
//         for (int num : arr1) {
//             set1.add(num);
//         }

//         // Step 2: arr1 ∩ arr2
//         for (int num : arr2) {
//             if (set1.contains(num)) {
//                 set2.add(num);
//             }
//         }

//         // Step 3: (arr1 ∩ arr2) ∩ arr3
//         for (int num : arr3) {
//             if (set2.contains(num)) {
//                 result.add(num);
//                 set2.remove(num); // duplicate avoid
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         List<Integer> arr1 = List.of(1, 5, 10, 20, 40, 80);
//         List<Integer> arr2 = List.of(6, 7, 20, 80, 100);
//         List<Integer> arr3 = List.of(3, 4, 15, 20, 30, 70, 80, 120);

//         List<Integer> common = commonElements(arr1, arr2, arr3);
//         System.out.println("Common elements: " + common);
//     }
// }
