import java.io.*;
import java.util.*;

public class Solution {

    static public int solve(int arr[], int k) {

        int max = 0;

        int i = 0;
        int j = 0;

        int sum = arr[0];

        while (j < arr.length) {
            if (sum < k) {
                j++;
                if (j < arr.length) {
                    sum += arr[j];
                }
            } else if (sum > k) {
                sum -= arr[i];
                i++;
            } else {
                max = Math.max(max, j - i + 1);
                j++;
                if (j < arr.length) {
                    sum += arr[j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = { 4, 1, 1, 1, 2, 3, 5 };
        int k = 5;

        System.out.println(solve(arr, k));
    }

}
