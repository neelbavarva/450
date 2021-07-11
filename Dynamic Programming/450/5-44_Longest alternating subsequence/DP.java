public class DP {

    // O(n^2)
    public int AlternatingaMaxLength(int[] arr) {

        int n = arr.length;
        if (n == 1) {
            return 1;
        }

        int dp[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            dp[i][0] = dp[i][1] = 1;
        }

        int max = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i][0] < dp[j][1] + 1) {
                    dp[i][0] = dp[j][1] + 1;
                } else if (arr[i] < arr[j] && dp[i][1] < dp[j][0] + 1) {
                    dp[i][1] = dp[j][0] + 1;
                }
            }

            max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
        }
        return max;
    }
}
