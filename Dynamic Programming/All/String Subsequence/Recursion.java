// Question Link : https://practice.geeksforgeeks.org/problems/find-number-of-times-a-string-occurs-as-a-subsequence3020/1/?category[]=Dynamic%20Programming&category[]=Dynamic%20Programming&problemStatus=unsolved&difficulty[]=0&page=1&sortBy=accuracy&query=category[]Dynamic%20ProgrammingproblemStatusunsolveddifficulty[]0page1sortByaccuracycategory[]Dynamic%20Programming#

import java.io.*;
import java.util.*;

public class Recursion {

    static int count(String a, String b, int m, int n) {

        if ((m == 0 && n == 0) || n == 0) {
            return 1;
        }

        if (m == 0) {
            return 0;
        }

        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return count(a, b, m - 1, n - 1) + count(a, b, m - 1, n);
        } else {
            return count(a, b, m - 1, n);
        }
    }

    public static void main(String[] args) throws IOException {

        String x = "geeksforgeeks";
        String y = "gks";

        int n = x.length();
        int m = y.length();

        System.out.println(count(x, y, n, m));

    }
}