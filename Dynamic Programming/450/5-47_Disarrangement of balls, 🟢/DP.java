public class DP {
    static long disarrange(int n) {
        long dp[] = new long[n + 1];
        long a = 1;
        long b = 2;
        int mod = 1000000007;

        if (n <= 3) {
            return n - 1;
        }

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
            dp[i] = ((i - 1) % mod * (dp[i - 1] + dp[i - 2]) % mod) % mod;
        }

        return dp[n];
    }
}
