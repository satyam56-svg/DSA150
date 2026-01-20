public class maxProfit {
    public static int maxProfit1(int[] prices) {

        // Initialize profit to 0
        int profit = 0;

        // Iterate through the price array
        for (int i = 1; i < prices.length; i++) {

            // If the current price is greater than the previous price
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit1(prices));
    }
}
