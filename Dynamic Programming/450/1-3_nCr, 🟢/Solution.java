public class Solution {
    static int mod = 1000000007;

    static int dp[][];

    static int solve(int n, int r) {
        if (r > n) {
            return 0;
        }

        if (r == 0 || n == r) {
            return 1;
        }

        if (dp[n][r] != -1) {
            return dp[n][r];
        }

        return dp[n][r] = (solve(n - 1, r - 1) % mod + solve(n - 1, r) % mod) % mod;
    }

    static int nCr(int n, int r) {

        dp = new int[n + 1][r + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= r; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = solve(n, r) % mod;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= r; j++) {
                dp[i][j] = -1;
            }
        }

        return ans;
    }
}
