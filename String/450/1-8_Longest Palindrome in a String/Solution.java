import java.util.*;

public class Solution {
    static String longestPalin(String S) {
        int n = S.length();
        int dp[][] = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
                if (i == j) {
                    dp[i][j] = 1;
                }
            }
        }

        int maxL = 1;
        int start = 0;

        int low = 0;
        int high = 0;

        for (int i = 1; i < n; i++) {
            low = i - 1;
            high = i;

            while (low >= 0 && high < n && S.charAt(low) == S.charAt(high)) {
                if (high - low + 1 > maxL) {
                    start = low;
                    maxL = high - low + 1;
                }

                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < n && S.charAt(low) == S.charAt(high)) {
                if (high - low + 1 > maxL) {
                    start = low;
                    maxL = high - low + 1;
                }
                --low;
                ++high;
            }
        }

        return S.substring(start, start + maxL);
    }
}
