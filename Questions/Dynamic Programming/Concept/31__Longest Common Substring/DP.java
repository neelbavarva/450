import java.io.*;
import java.util.*;

public class DP {

    public static void main(String[] args) throws IOException {

        String x = "abcdefg";
        String y = "abefkop";
        int n = x.length();
        int m = x.length();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        // Storing the maximum value of matrix in max

        int max = -1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (max < dp[i][j]) {
                    max = dp[i][j];
                }
            }
        }

        System.out.println(max);

    }
}