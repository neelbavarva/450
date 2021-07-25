
public class Solution {
    static int dp[][];

    public static int solve(int e, int f) {
        if (f == 0 || f == 1) {
            return f;
        }

        if (e == 1) {
            return f;
        }

        if (dp[e][f] != -1) {
            return dp[e][f];
        }

        int min = Integer.MAX_VALUE;

        for (int k = 1; k <= f; k++) {
            int temp = 1 + Math.max(solve(e - 1, k - 1), solve(e, f - k));
            min = Math.min(min, temp);
        }

        return dp[e][f] = min;
    }

    static int eggDrop(int n, int k) {
        dp = new int[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(n, k);
    }
}
