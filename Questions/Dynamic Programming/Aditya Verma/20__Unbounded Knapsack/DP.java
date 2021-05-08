import java.io.*;
import java.util.*;

public class DP {

    public static void main(String[] args) throws IOException {

        int wt[] = { 1, 2, 3, 4 };
        int val[] = { 2, 5, 6, 4 };
        int n = 4;
        int cap = 4;

        int dp[][] = new int[n + 1][cap + 1];

        // Initialize the first row and column with Zero

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < cap + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // Main DP loop

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < cap + 1; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][cap]);

    }
}