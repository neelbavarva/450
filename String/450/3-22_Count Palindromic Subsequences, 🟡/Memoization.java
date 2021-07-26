import java.util.*;

public class Memoization {
    static long dp[][];

    static int mod = 1000000007;

    public static long solve(int i, int j, String str) {
        if (i > j) {
            return 0;
        }

        if (i == j) {
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j] % mod;
        }

        if (str.charAt(i) == str.charAt(j)) {
            return dp[i][j] = ((solve(i + 1, j, str) % mod + solve(i, j - 1, str) % mod) % mod + 1) % mod;
        } else {
            return dp[i][j] = ((solve(i + 1, j, str) - solve(i + 1, j - 1, str) + mod) % mod
                    + solve(i, j - 1, str) % mod) % mod;
        }

    }

    long countPS(String str) {
        dp = new long[str.length() + 1][str.length() + 1];

        for (int i = 0; i < str.length() + 1; i++) {
            for (int j = 0; j < str.length() + 1; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(0, str.length() - 1, str) % mod;

    }
}
