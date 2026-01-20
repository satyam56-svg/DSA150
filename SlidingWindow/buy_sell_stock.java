class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE; // Initial minimum price set to maximum possible value
        int maxProfit=0;    // Initial maximum profit set to 0

        for(int price: prices) {    // Loop through each price in the array
            if(price<minPrice) {    // If current price is less than the minimum price found so far
                minPrice=price; // Update the minimum price
            } else {
                maxProfit=Math.max(maxProfit,price-minPrice);   // Calculate profit if sold at current price and update maxProfit if it's greater
            }
        }

        return maxProfit;   // Return the maximum profit found
    }
}

public class buy_sell_stock {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example prices
        System.out.println(solution.maxProfit(prices)); // Output: 5 (buy at 1 and sell at 6)
    }
}

// Steps:
// 1. Initialse minimum price set to +infinity
// 2. Initialse maximum profit set to 0
// 3. loop through each price in the array
// 4. if the current price is less than the min price update the min price
// 5. calculate profit if sold at current price and update maxProfit if it's greater
// 6. Return the maximum profit