public class Memoization {
    static int dp[][];

    public int solve(String s, String t, int n, int m) {
        if (n == 0) {
            return m;
        }

        if (m == 0) {
            return n;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (s.charAt(n - 1) == t.charAt(m - 1)) {
            return dp[n][m] = solve(s, t, n - 1, m - 1);
        }

        return dp[n][m] = 1
                + Math.min(solve(s, t, n - 1, m - 1), Math.min(solve(s, t, n, m - 1), solve(s, t, n - 1, m)));
    }

    public int editDistance(String s, String t) {
        dp = new int[s.length() + 1][t.length() + 1];

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= t.length(); j++) {
                dp[i][j] = -1;
            }
        }

        return solve(s, t, s.length(), t.length());
    }
}
