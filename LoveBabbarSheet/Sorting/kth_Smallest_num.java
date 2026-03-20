// import java.util.ArrayList;
// import java.util.Arrays;

// public class kth_Smallest_num {
//     public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {

//         // 1. Sort ranges on basis of start
//         Arrays.sort(range, (a, b) -> a[0] - b[0]);

//         // 2. Merge overlapping ranges
//         ArrayList<int[]> merged = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             int start = range[i][0];
//             int end = range[i][1];

//             if (merged.size() == 0) {
//                 merged.add(new int[]{start, end});
//             } else {
//                 int[] last = merged.get(merged.size() - 1);

//                 if (start <= last[1]) {
//                     // overlap → merge
//                     last[1] = Math.max(last[1], end);
//                 } else {
//                     // no overlap → new range
//                     merged.add(new int[]{start, end});
//                 }
//             }
//         }

//         // 3. Prefix array (count of numbers till each range)
//         int m = merged.size();
//         int[] prefix = new int[m];

//         prefix[0] = merged.get(0)[1] - merged.get(0)[0] + 1;

//         for (int i = 1; i < m; i++) {
//             int len = merged.get(i)[1] - merged.get(i)[0] + 1;
//             prefix[i] = prefix[i - 1] + len;
//         }

//         // 4. Answer queries
//         ArrayList<Integer> ans = new ArrayList<>();

//         for (int i = 0; i < q; i++) {
//             int k = queries[i];

//             int idx = -1;

//             // find range where k lies
//             for (int j = 0; j < m; j++) {
//                 if (prefix[j] >= k) {
//                     idx = j;
//                     break;
//                 }
//             }

//             if (idx == -1) {
//                 ans.add(-1);
//             } else {
//                 int prev = (idx == 0) ? 0 : prefix[idx - 1];
//                 int start = merged.get(idx)[0];

//                 int value = start + (k - prev - 1);
//                 ans.add(value);
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         int[][] range = {{1, 3}, {5, 7}, {2, 4}};
//         int q = 4;
//         int[] queries = {1, 2, 3, 4};

//         ArrayList<Integer> result = kthSmallestNum(n, range, q, queries);
//         System.out.println(result); // Output: [1, 2, 3, 4]
//     }
// }
