public class DP {
    long countWays(int n, int k) {
        long mod = 1000000007;
        long dp[] = new long[n + 2];

        dp[0] = 0;
        dp[1] = k;
        dp[2] = k * k;

        for (int i = 3; i <= n; i++) {
            dp[i] = ((k - 1) * (dp[i - 1] + dp[i - 2])) % mod;
        }

        return dp[n];

    }
}
