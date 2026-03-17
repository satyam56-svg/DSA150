// import java.util.ArrayList;

// public class find_closest_pair {
//     public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         int i = 0;
//         int j = arr2.length - 1;
        
//         int closest = Integer.MAX_VALUE;
//         int a = 0, b = 0;
        
//         while(i < arr1.length && j >= 0) {
            
//             int sum = arr1[i] + arr2[j];
//             int currDiff = Math.abs(sum - x);
            
//             if(currDiff < closest) {
//                 closest = currDiff;
//                 a = arr1[i];
//                 b = arr2[j];
//             }
            
//             if(sum > x) {
//                 j--;
//             } else {
//                 i++;
//             }
//         }
        
//         ans.add(a);
//         ans.add(b);
        
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr1[] = {1, 4, 5, 7};
//         int arr2[] = {10, 20, 30, 40};
//         int x = 32;
        
//         ArrayList<Integer> ans = findClosestPair(arr1, arr2, x);
        
//         System.out.println(ans);
//     }
// }
