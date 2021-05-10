import java.io.*;
import java.util.*;

public class Recursion {

    static public int solve(String x, String y, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return (1 + solve(x, y, n - 1, m - 1));
        } else {
            return Math.max(solve(x, y, n - 1, m), solve(x, y, n, m - 1));
        }
    }

    public static void main(String[] args) throws IOException {

        String x = "abcdefg";
        String y = "abefkop";
        int n = x.length();
        int m = x.length();

        System.out.println(solve(x, y, n, m));

    }
}