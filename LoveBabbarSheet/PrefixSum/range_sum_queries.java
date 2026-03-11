// package PrefixSum;

// import java.util.ArrayList;

// public class range_sum_queries {
//     public static ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
//         // code here
//         ArrayList<Integer>ans=new ArrayList<>();
//         int n=arr.length;
//         int prefix[]=new int[n];
//         int sum=0;
        
//         for(int i=0; i<n; i++) {
//             prefix[i]=sum+arr[i];
//             sum=prefix[i];
//         }
        
//         for(int i=0; i<queries.length; i++) {
//             int left=queries[i][0];
//             int right=queries[i][1];
//             if(left == 0)
//                 ans.add(prefix[right]);
//             else
//             ans.add(prefix[right]-prefix[left-1]);
//         }
        
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int[][] queries = {{0, 2}, {1, 3}, {0, 4}};
//         ArrayList<Integer> result = rangeSumQueries(arr, queries);
//         System.out.println(result); // Output: [6, 9, 15]
//     }

// }
