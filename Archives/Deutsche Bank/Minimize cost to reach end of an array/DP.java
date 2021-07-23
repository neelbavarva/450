import java.util.Scanner;

public class DP {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long arr[] = new long[(int) n];

        for (long i = 0; i < n; i++) {
            arr[(int) i] = sc.nextLong();
        }

        long dp[] = new long[(int) n + 1];

        for (long i = 0; i <= n; i++) {
            dp[(int) i] = Integer.MAX_VALUE;
        }

        dp[0] = arr[0];
        dp[2] = dp[0] + arr[2];
        dp[1] = arr[1] + dp[2];

        for (int i = 3; i < n; i++) {
            dp[i] = Math.min(dp[i], dp[i - 2] + arr[i]);
            dp[i - 1] = Math.min(dp[i - 1], dp[i] + arr[i - 1]);
        }

        System.out.println(Math.min(dp[(int) n - 1], dp[(int) n - 2]));

    }

}
