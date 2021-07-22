import java.io.*;
import java.util.*;

public class Solution {

    static boolean araAnagram(String s1, String s2) {

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            return true;
        } else {
            return false;
        }
    }

    static public int solve(String text, String word) {

        int N = text.length();
        int n = word.length();

        int res = 0;

        for (int i = 0; i <= N - n; i++) {

            String s = text.substring(i, i + n);

            if (araAnagram(word, s)) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) throws IOException {

        String str = "abcxyzabcba";
        String s = "abc";

        System.out.println(solve(str, s));
    }

}
