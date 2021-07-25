import java.io.*;
import java.util.*;

public class Memoization {

    static int dp[][];

    public static int solve(int e, int f) {
        if (f == 0 || f == 1) {
            return f;
        }

        if (e == 1) {
            return f;
        }

        if (dp[e][f] != -1) {
            return dp[e][f];
        }

        int min = Integer.MAX_VALUE;

        for (int k = 1; k <= f; k++) {
            int temp = 1 + Math.max(solve(e - 1, k - 1), solve(e, f - k));
            min = Math.min(min, temp);
        }

        return dp[e][f] = min;
    }

    public static void main(String[] args) throws IOException {

        dp = new int[3][11];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 11; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(2, 10));
    }

}
