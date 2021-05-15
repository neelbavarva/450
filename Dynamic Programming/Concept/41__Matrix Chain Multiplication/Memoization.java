import java.io.*;
import java.util.*;

public class Memoization {

    static int dp[][];

    static public int solve(int arr[], int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            dp[i][j] = solve(arr, i, k) + solve(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];

            if (dp[i][j] < min) {
                min = dp[i][j];
            }
        }

        return min;
    }

    public static void main(String[] args) throws IOException {

        int arr[] = { 40, 20, 30, 10, 30 };
        int n = arr.length;

        dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(arr, 1, 4));

    }
}