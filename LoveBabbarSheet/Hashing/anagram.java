// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;

// public class anagram {
//     public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        
//         HashMap<String, ArrayList<String>> map = new HashMap<>();
        
//         for (String arr1 : arr) {
//             // 1. string sort karo
//             char[] ch = arr1.toCharArray();
//             Arrays.sort(ch);
//             String key = new String(ch);
//             // 2. map me add karo
//             if(!map.containsKey(key)) {
//                 map.put(key, new ArrayList<>());
//             }
//             map.get(key).add(arr1);
//         }
        
//         // 3. answer banao
//         ArrayList<ArrayList<String>> ans = new ArrayList<>();
        
//         for(ArrayList<String> list : map.values()) {
//             ans.add(list);
//         }
        
//         return ans;
//     }

//     public static void main(String[] args) {
//         anagram obj = new anagram();
//         String[] arr = {"cat", "dog", "tac", "god"};
//         ArrayList<ArrayList<String>> result = obj.anagrams(arr);
//         System.out.println(result); // Output: [["cat", "tac"], ["dog", "god"]]
//     }
// }
