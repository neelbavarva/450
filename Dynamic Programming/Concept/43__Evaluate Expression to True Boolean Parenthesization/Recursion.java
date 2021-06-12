import java.io.*;
import java.util.*;

public class Recursion {
    static int solve(String str, int i, int j, int isTrue) {
        if (i > j) {
            return 0;
        }

        if (i == j) {
            if (isTrue == 1) {
                return (str.charAt(i) == 'T') ? 1 : 0;
            } else {
                return (str.charAt(i) == 'F') ? 1 : 0;
            }
        }

        int temp_ans = 0;

        int leftTrue, rightTrue, leftFalse, rightFalse;

        for (int k = i + 1; k <= j - 1; k = k + 2) {

            leftTrue = solve(str, i, k - 1, 1);

            leftFalse = solve(str, i, k - 1, 0);

            rightTrue = solve(str, k + 1, j, 1);

            rightFalse = solve(str, k + 1, j, 0);

            // Evaluate AND operation
            if (str.charAt(k) == '&') {
                if (isTrue == 1) {
                    temp_ans = temp_ans + leftTrue * rightTrue;
                } else {
                    temp_ans = temp_ans + leftTrue * rightFalse + leftFalse * rightTrue + leftFalse * rightFalse;
                }
            }
            // Evaluate OR operation
            else if (str.charAt(k) == '|') {
                if (isTrue == 1) {
                    temp_ans = temp_ans + leftTrue * rightTrue + leftTrue * rightFalse + leftFalse * rightTrue;
                } else {
                    temp_ans = temp_ans + leftFalse * rightFalse;
                }
            }

            // Evaluate XOR operation
            else if (str.charAt(k) == '^') {
                if (isTrue == 1) {
                    temp_ans = temp_ans + leftTrue * rightFalse + leftFalse * rightTrue;
                } else {
                    temp_ans = temp_ans + leftTrue * rightTrue + leftFalse * rightFalse;
                }
            }
        }

        return temp_ans;

    }

    public static void main(String[] args) throws IOException {

        String s = "T|T&F^T";
        System.out.println(solve(s, 0, s.length(), 1));
    }
}
