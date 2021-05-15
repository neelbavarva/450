import java.io.*;
import java.util.*;

public class Recursion {

    static public int solve(int arr[], int i, int j) {
        if (i >= j) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int temp_ans = solve(arr, i, k) + solve(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];

            if (temp_ans < min) {
                min = temp_ans;
            }
        }

        return min;
    }

    public static void main(String[] args) throws IOException {

        int arr[] = { 40, 20, 30, 10, 30 };

        System.out.println(solve(arr, 1, 4));
        ;
    }
}