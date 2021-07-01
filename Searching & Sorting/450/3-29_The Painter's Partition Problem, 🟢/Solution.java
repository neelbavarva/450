public class Solution {
    public static boolean isValid(int arr[], int n, int k, long mid) {
        long p = 1;
        long count = 0;

        for (int i = 0; i < n; i++) {
            count += arr[i];

            if (count > mid) {
                count = arr[i];
                p++;
            }

            if (k < p) {
                return false;
            }
        }

        return true;
    }

    static long minTime(int arr[], int n, int k) {

        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        if (n < k) {
            return max;
        }

        long start = max;
        long end = sum;

        long res = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isValid(arr, n, k, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}
