// package LoveBabbarSheet;

// public class Min_Jump {
//     public int minJumps(int[] arr) {
//         int n = arr.length;
        
//         // Edge Case 1: Empty array
//         if (n == 0) return 0;
        
//         // Edge Case 2: Single element (already at end)
//         if (n == 1) return 0;
        
//         // Edge Case 3: Cannot jump from start
//         if (arr[0] == 0) return -1;
        
//         int jumps = 0;
//         int currEnd = 0;
//         int farthest = 0;
        
//         for(int i = 0; i < n - 1; i++) {
//             farthest = Math.max(farthest, i + arr[i]);
            
//             // Edge Case 4: Stuck - cannot reach further
//             if (farthest <= i) {
//                 return -1;
//             }
            
//             if (i == currEnd) {
//                 jumps++;
//                 currEnd = farthest;
                
//                 // Optimization: reached end
//                 if (currEnd >= n - 1) {
//                     break;
//                 }
//             }
//         }
        
//         return jumps;
//     }
// }
