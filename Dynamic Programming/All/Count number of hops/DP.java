// Question Link: https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1/?category[]=Dynamic%20Programming&category[]=Dynamic%20Programming&problemStatus=unsolved&difficulty[]=0&page=1&sortBy=submissions&query=category[]Dynamic%20ProgrammingproblemStatusunsolveddifficulty[]0page1sortBysubmissionscategory[]Dynamic%20Programming

import java.io.*;
import java.util.*;

public class DP {

    static long countWays(int n) {
        long dp[] = new long[n + 1];

        if (n <= 2) {
            return n;
        }

        if (n == 3) {
            return 4;
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {

        System.out.println(countWays(7));

    }
}