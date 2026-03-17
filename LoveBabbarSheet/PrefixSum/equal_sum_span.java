// import java.util.HashMap;

// public class equal_sum_span {
//     public static int equalSumSpan(int[] a1, int[] a2) {
//         HashMap<Integer,Integer>map=new HashMap<>();
        
//         int prefixSum=0;
//         int maxLen=0;
        
//         map.put(0,-1);
        
//         for(int i=0; i<a1.length; i++) {
//             int diff=a1[i]-a2[i];
//             prefixSum+=diff;
            
//             if(map.containsKey(prefixSum)) {
//                 int len=i-map.get(prefixSum);
//                 maxLen=Math.max(maxLen,len);
//             } else {
//                 map.put(prefixSum,i);
//             }
//         }
        
//         return maxLen;
//     }

//     public static void main(String[] args) {
//         int[] a1 = {1, 2, 3, 4, 5};
//         int[] a2 = {5, 4, 3, 2, 1};
        
//         int result = equalSumSpan(a1, a2);
//         System.out.println("Length of the longest span with equal sum: " + result);
//     }
// }