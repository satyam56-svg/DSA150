public class coinsChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        int result = coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result); // Output: 3 (11 = 5 + 5 + 1)
    }
}

// STEPS:
// 1. Initialse with large value (infinity)..
// 2. dp array ke index=1 se index=amount tk ka value amount+1 store krdo..
// 3. dp array ke index=0 ka value 0 ho..
// 4. ab coin variable ki madad se coins array ko traverse kro..
// 5. isme ek aur loop chlao i=coin se i<=amount tk..
// 6. dp[amount] ko return krdo agar dp[amount]>amount ho..