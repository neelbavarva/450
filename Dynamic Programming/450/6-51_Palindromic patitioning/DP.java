public class DP {
    static int dp[][];

    public static boolean isPalindrome(String s, int i, int j) {

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    static int solve(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (isPalindrome(s, i, j)) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        dp[i][j] = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            dp[i][j] = Math.min(dp[i][j], 1 + solve(s, i, k) + solve(s, k + 1, j));

        }

        return dp[i][j];
    }

    static int palindromicPartition(String s) {
        int n = s.length();
        dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(s, 0, n - 1);
    }
}
