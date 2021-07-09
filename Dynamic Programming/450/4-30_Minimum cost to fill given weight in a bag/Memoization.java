public class Memoization {
    static int dp[][];

    public int solve(int cost[], int n, int w) {

        if (w == 0) {
            return 0;
        }

        if (n <= 0 || w < 0) {
            return -1;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (n > w || cost[n - 1] == -1) {
            return dp[n][w] = solve(cost, n - 1, w);

        } else {

            int include = solve(cost, n, w - n);
            int exclude = solve(cost, n - 1, w);

            if (include == -1 || exclude == -1) {
                if (include == -1 && exclude == -1) {
                    return dp[n][w] = -1;
                } else if (include == -1) {
                    return dp[n][w] = exclude;
                } else {
                    return dp[n][w] = include + cost[n - 1];
                }
            } else {
                return dp[n][w] = Math.min(cost[n - 1] + include, exclude);
            }

        }
    }

    public int minimumCost(int cost[], int n, int w) {
        dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(cost, n, w);
    }
}
