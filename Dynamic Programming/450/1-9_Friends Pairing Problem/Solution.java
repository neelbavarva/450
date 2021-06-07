public class Solution {
    static int mod = 1000000007;

    public long countFriendsPairings(int n) {
        long dp[] = new long[n + 2];

        for (int i = 1; i <= n + 1; i++) {
            if (i <= 2) {
                dp[i] = (long) i;
            } else {
                dp[i] = (dp[i - 1] + (i - 1) * dp[i - 2]) % mod;
            }
        }

        return dp[n] % mod;
    }
}
