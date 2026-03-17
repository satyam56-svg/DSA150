// public class find_max_sum {

//     public static int findMaxSum(int arr[]) {
//         // code here
//         int prev1=0;
//         int prev2=0;
        
//         for(int i=0; i<arr.length; i++) {
//             int take=arr[i]+prev2;
//             int skip=prev1;
            
//             int current=Math.max(take,skip);
            
//             prev2=prev1;
//             prev1=current;
//         }
        
//         return prev1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 2, 7, 10};
//         System.out.println(findMaxSum(arr)); // Output: 13 (3 + 10)
//     }
// }