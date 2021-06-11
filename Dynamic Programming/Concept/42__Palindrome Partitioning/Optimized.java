import java.io.*;
import java.util.*;

public class Optimized {
    static int dp[][];

    public static int solve(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (isPalindrome(s, i, j)) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int left;
            if (dp[i][k] == -1) {
                left = solve(s, i, k);
                dp[i][k] = solve(s, i, k);
            } else {
                left = dp[i][k];
            }

            int right;
            if (dp[k + 1][j] == -1) {
                right = solve(s, k + 1, j);
                dp[k + 1][j] = solve(s, k + 1, j);
            } else {
                right = dp[k + 1][j];
            }

            int temp = 1 + left + right;
            min = Math.min(min, temp);
        }

        return dp[i][j] = min;
    }

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

    public static void main(String[] args) throws IOException {

        String s = "neel";
        dp = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(s, 0, s.length() - 1));

    }
}
