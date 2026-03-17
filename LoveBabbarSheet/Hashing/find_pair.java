// import java.util.HashSet;

// public class find_pair {
//     public static boolean findPair(int[] arr, int x) {

//         HashSet<Integer> set = new HashSet<>();

//         for(int num : arr) {

//             if(set.contains(num + x) || set.contains(num - x)) {
//                 return true;
//             }

//             set.add(num);
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 5, 3, 4, 2};
//         int x = 3;
//         System.out.println(findPair(arr, x));
//     }
// }
