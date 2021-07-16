public class DP {

    // Using Unbounded Knapsack

    public int maximizeCuts(int n, int x, int y, int z) {

        int arr[] = { x, y, z };

        int dp[][] = new int[3 + 1][n + 1];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    if (i == 0) {
                        dp[i][j] = Integer.MIN_VALUE;
                    } else if (j == 0) {
                        dp[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < 3 + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(1 + dp[i][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[3][n] < 0 ? 0 : dp[3][n];

    }
}
