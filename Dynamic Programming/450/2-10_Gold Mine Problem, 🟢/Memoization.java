public class Memoization {
    static int dp[][];

    static int solve(int i, int j, int M[][], int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return 0;
        }

        if (dp[i + 1][j + 1] != -1) {
            return dp[i + 1][j + 1];
        }

        return dp[i + 1][j + 1] = M[i][j] + Math.max(solve(i, j + 1, M, n, m),
                Math.max(solve(i - 1, j + 1, M, n, m), solve(i + 1, j + 1, M, n, m)));
    }

    static int maxGold(int n, int m, int M[][]) {
        int max = Integer.MIN_VALUE;

        dp = new int[n + 1][m + 1];

        for (int j = 0; j <= n; j++) {
            for (int k = 0; k <= m; k++) {
                dp[j][k] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            int temp = solve(i, 0, M, n, m);
            max = Math.max(temp, max);
        }

        return max;
    }
}
