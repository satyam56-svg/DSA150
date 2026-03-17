// import java.util.ArrayList;
// import java.util.Arrays;

// public class maxMin_candy {
//     public static ArrayList<Integer> minMaxCandy(int[] prices, int k) {

//         Arrays.sort(prices);

//         ArrayList<Integer> list = new ArrayList<>();

//         int n = prices.length;

//         int min = 0;
//         int max = 0;

//         // MINIMUM COST
//         int i = 0;
//         int j = n - 1;

//         while(i <= j) {
//             min += prices[i]; // buy cheapest
//             i++;              // move forward
//             j -= k;           // take k free from end
//         }

//         // MAXIMUM COST
//         i = n - 1;
//         j = 0;

//         while(i >= j) {
//             max += prices[i]; // buy expensive
//             i--;              // move backward
//             j += k;           // take k free from start
//         }

//         list.add(min);
//         list.add(max);

//         return list;
//     }

//     public static void main(String[] args) {
//         int[] prices = {3, 2, 1, 4};
//         int k = 2;
//         ArrayList<Integer> result = minMaxCandy(prices, k);
//         System.out.println(result); // Output: [3, 7]
//     }
// }
