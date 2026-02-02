// package LoveBabbarSheet;

// import java.util.HashMap;

// public class RanSom {
//     public static boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character, Integer> mag = new HashMap<>();
//         // Count magazine
//         for (char ch : magazine.toCharArray()) {
//             mag.put(ch, mag.getOrDefault(ch, 0) + 1);
//         }
//         // Check ransomNote
//         for (char ch : ransomNote.toCharArray()) {
//             if (!mag.containsKey(ch) || mag.get(ch) == 0) {
//                 return false;
//             }
//             mag.put(ch, mag.get(ch) - 1);
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(canConstruct("aaa","aab"));
//     }
// }