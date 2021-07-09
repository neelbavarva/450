public class Solution {
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int n, int k) {
        Arrays.sort(arr);

        int dp[] = new int[n + 1];

        if (n == 1) {
            return 0;
        }

        dp[0] = 0;
        dp[1] = arr[1] - arr[0] < k ? arr[1] + arr[0] : 0;

        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] < k) {
                dp[i] = Math.max(dp[i - 2] + arr[i - 1] + arr[i], dp[i - 1]);
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[n - 1];
    }
}
