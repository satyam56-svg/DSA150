// import java.util.HashMap;

// public class sec_freq_str {
//     public static String secFrequent(String arr[], int N) {

//         HashMap<String,Integer> map = new HashMap<>();

//         // frequency count
//         for(int i=0; i<N; i++) {

//             String curr = arr[i];

//             if(!map.containsKey(curr)) {
//                 map.put(curr,1);
//             } else {
//                 map.put(curr,map.get(curr)+1);
//             }
//         }

//         int firstMax = 0;
//         int secondMax = 0;

//         // find first max frequency
//         for(int value : map.values()) {
//             if(value > firstMax) {
//                 firstMax = value;
//             }
//         }

//         // find second max frequency
//         for(int value : map.values()) {
//             if(value > secondMax && value < firstMax) {
//                 secondMax = value;
//             }
//         }

//         // find string with second max
//         for(String key : map.keySet()) {
//             if(map.get(key) == secondMax) {
//                 return key;
//             }
//         }

//         return "";
//     }

//     public static void main(String[] args) {
//         String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa"};
//         int N = arr.length;
//         System.out.println(secFrequent(arr, N)); // Output: "ccc"
//     }
// }
