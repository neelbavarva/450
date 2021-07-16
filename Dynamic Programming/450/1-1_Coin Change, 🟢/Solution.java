public class Solution {
    public long count(int coin[], int n, int sum) {
        // int coin[] = { 1, 2, 3 };
        // int n = 3;
        // int sum = 4;

        long dp[][] = new long[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coin[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coin[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];

    }
}
