public class Solution {
    public long count(int n) {
        long arr[] = { 3, 5, 10 };
        long dp[][] = new long[3 + 1][n + 1];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    if (i == 0) {
                        dp[i][j] = 0;
                    }

                    if (j == 0) {
                        dp[i][j] = 1;
                    }
                }
            }
        }

        dp[0][0] = 1;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((int) arr[i - 1] <= j) {
                    dp[i][j] = dp[i][j - (int) arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[3][n];
    }
}
