public class DP_Optimized {

    static int ceilArr(int tail[], int l, int r, int x) {
        while (l < r) {
            int m = l + (r - l) / 2;

            if (tail[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return r;
    }

    // O(N*log(N))
    static int longestSubsequence(int n, int arr[]) {

        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int index = ceilArr(dp, 0, n, arr[i]);
            if (arr[i] > dp[index - 1]) {
                dp[index] = arr[i];
            }
        }

        int max = 0;
        for (int i = n; i >= 0; i--) {
            if (dp[i] != Integer.MAX_VALUE) {
                max = i;
                break;
            }
        }

        return max;
    }
}
