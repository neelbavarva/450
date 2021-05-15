import java.io.*;
import java.util.*;

public class DP {

    static public String reverse(String s) {
        String temp = s;
        s = "";

        for (int i = temp.length() - 1; i >= 0; i--) {
            s += temp.charAt(i);
        }

        return s;
    }

    public static void main(String[] args) throws IOException {

        String x = "abcdaf";
        String y = "acbcf";
        int n = x.length();
        int m = y.length();

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
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int i = n;
        int j = m;
        String ans = "";

        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                ans += x.charAt(i - 1);
                i--;
                j--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    ans += y.charAt(j - 1);
                    j--;
                } else if (dp[i - 1][j] > dp[i][j - 1]) {
                    ans += x.charAt(i - 1);
                    i--;
                }
            }
        }

        if (i > 0) {
            while (i > 0) {
                ans += x.charAt(i - 1);
                i--;
            }
        } else if (j > 0) {
            while (j > 0) {
                ans += y.charAt(j - 1);
                j--;
            }
        }

        System.out.println(reverse(ans));

    }
}