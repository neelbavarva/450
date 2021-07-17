public class Solution {
    static long countBT(int h) {
        if (h == 0 || h == 1) {
            return 1;
        }

        int mod = 1000000007;
        long dp[] = new long[h + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= h; i++) {
            dp[i] = dp[i - 1] * (2 * dp[i - 2] % mod + dp[i - 1]) % mod;
        }

        return dp[h];

    }
}
