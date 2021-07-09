public class Memoization {
    static int dp[][];

    static int solve(int n, int arr[][], int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= n) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        return dp[i][j] = arr[i][j]
                + Math.max(solve(n, arr, i + 1, j), Math.max(solve(n, arr, i + 1, j - 1), solve(n, arr, i + 1, j + 1)));
    }

    static int maximumPath(int n, int arr[][]) {
        dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = solve(n, arr, 0, i);
            max = Math.max(max, temp);
        }

        return max;
    }
}
