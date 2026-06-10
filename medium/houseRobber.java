
class houseRobber {
    public static void main(String[] args) {
        int[] money = { 2, 7, 9, 3, 1 };
        int n = money.length;
        int[] dp = new int[n];
        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]);
        }

        System.out.println(dp[n - 1]);
    }
}