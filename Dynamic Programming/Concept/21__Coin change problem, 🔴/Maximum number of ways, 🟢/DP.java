import java.io.*;
import java.util.*;

public class DP {

    public static void main(String[] args) throws IOException {

        int coin[] = { 1, 2, 3 };
        int n = 3;
        int val = 5;

        int dp[][] = new int[n + 1][val + 1];

        // Initialize the first row and column with Zero

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < val + 1; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                } else if (j == 0) {
                    dp[i][j] = 1;
                }
            }
        }

        dp[0][0] = 1;

        // Main DP loop

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < val + 1; j++) {
                if (coin[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coin[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][val]);

    }
}