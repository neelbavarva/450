public class DP {

    static long dp[][];

    static long solve(int arr[], int i, int j) {
        if (i > j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        long sum1 = arr[i] + Math.min(solve(arr, i + 1, j - 1), solve(arr, i + 2, j));
        long sum2 = arr[j] + Math.min(solve(arr, i + 1, j - 1), solve(arr, i, j - 2));

        return dp[i][j] = Math.max(sum1, sum2);
    }

    static long countMaximum(int arr[], int n) {
        dp = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(arr, 0, n - 1);
    }
}
