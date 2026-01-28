// package LoveBabbarSheet;

// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;

// public class duplicate {
//     public static ArrayList<Integer> findDuplicates(int[] arr) {
//         HashSet<Integer> seen = new HashSet<>();
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         for(int num : arr) {
//             if(!seen.add(num)) {  // add() returns false if already exists
//                 ans.add(num);
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,3,1,2};
//         List<Integer>ans=findDuplicates(arr);
//         System.out.println(ans);
//     }
// }
