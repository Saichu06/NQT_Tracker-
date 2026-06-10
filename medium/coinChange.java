public class coinChange {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;

        int[] dp = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            System.out.println("Not found");
        } else {
            System.out.println(dp[amount]);
        }
    }
}
