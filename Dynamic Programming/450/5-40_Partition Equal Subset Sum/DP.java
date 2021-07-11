public class DP {
    static int equalPartition(int n, int arr[]) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        if (sum % 2 == 1) {
            return 0;
        } else {
            sum = sum / 2;

            boolean dp[][] = new boolean[n + 1][sum + 1];

            for (int j = 0; j <= sum; j++) {
                dp[0][j] = false;
            }

            for (int i = 0; i <= n; i++) {
                dp[i][0] = true;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (arr[i - 1] <= j) {
                        dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            if (dp[n][sum]) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
