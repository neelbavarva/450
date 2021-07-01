import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isValid(int arr[], int n, int student, int mid) {
        int k = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > mid) {
                sum = arr[i];
                k++;
            }

            if (k > student) {
                return false;
            }
        }

        return true;
    }

    public static int minPage(int arr[], int student) {

        if (arr.length < student) {
            return -1;
        }

        int sum = 0;
        int n = arr.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int start = max;
        int end = sum;

        int res = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (isValid(arr, n, student, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = { 10, 20, 30, 40 };
        System.out.println(minPage(arr, 2));
    }
}
