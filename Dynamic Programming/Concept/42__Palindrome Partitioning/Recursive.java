import java.io.*;
import java.util.*;

public class Recursive {
    public static int solve(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (isPalindrome(s, i, j)) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = 1 + solve(s, i, k) + solve(s, k + 1, j);
            min = Math.min(min, temp);
        }

        return min;
    }

    public static boolean isPalindrome(String s, int i, int j) {

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        String s = "neel";

        System.out.println(solve(s, 0, s.length() - 1));

    }
}
