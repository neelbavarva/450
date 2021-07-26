import java.util.*;

public class Recursion {
    static long count = 0;

    public static boolean isPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void solve(String output, String input) {
        if (input == "" || input.equals("")) {
            if (isPalindrome(output)) {
                count++;
            }

            return;
        }

        solve(output + input.charAt(0), input.substring(1));
        solve(output, input.substring(1));
    }

    long countPS(String str) {
        count = 0;
        solve("", str);
        return count - 1;
    }
}
