import java.io.*;
import java.util.*;

public class DP {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 6, 11, 5 };

        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Subset Sum's code

        boolean dp[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (j == 0) {
                    dp[i][j] = true;
                }
                if (i == 0) {
                    dp[i][j] = false;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {

                // Main Approach
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Minumun Subset Sum Difference Logic

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < sum + 1; i++) {
            if (dp[n][i]) {
                list.add(i);
            }
        }

        System.out.println(list);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if ((Math.abs(sum - 2 * list.get(i))) < min) {
                min = Math.abs(sum - 2 * list.get(i));
            }
        }

        System.out.println(min);

    }
}