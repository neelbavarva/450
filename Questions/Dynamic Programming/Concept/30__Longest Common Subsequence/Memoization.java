import java.io.*;
import java.util.*;

public class Memoization {

    static int dp[][];

    static public int solve(String x, String y, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return dp[n][m] = (1 + solve(x, y, n - 1, m - 1));
        } else {
            return dp[n][m] = Math.max(solve(x, y, n - 1, m), solve(x, y, n, m - 1));
        }
    }

    public static void main(String[] args) throws IOException {

        String x = "abcdefg";
        String y = "abefkop";
        int n = x.length();
        int m = x.length();
        dp = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(x, y, n, m));

    }
}