import java.io.*;
import java.util.*;

public class Solution {
    static long dp[][];

    static long solve(int arr[], int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (dp[(int) i][(int) j] != -1) {
            return dp[(int) i][(int) j];
        }

        dp[(int) i][(int) j] = Integer.MAX_VALUE;
        for (long k = i; k <= j - 1; k++) {
            dp[(int) i][(int) j] = Math.min(dp[(int) i][(int) j], solve(arr, i, (int) k) + solve(arr, (int) k + 1, j)
                    + arr[(int) i - 1] * arr[(int) k] * arr[(int) j]);

        }

        return dp[(int) i][(int) j];
    }

    static int matrixMultiplication(int N, int arr[]) {
        dp = new long[(int) N + 1][(int) N + 1];
        for (long i = 0; i <= N; i++) {
            for (long j = 0; j <= N; j++) {
                dp[(int) i][(int) j] = -1;
            }
        }

        return (int) solve(arr, 1, N - 1);

    }
}
