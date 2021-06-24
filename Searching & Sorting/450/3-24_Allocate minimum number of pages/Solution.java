public class Solution {
    public static boolean isValid(int arr[], int n, int student, int mid) {
        int k = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += arr[i];

            if (count > mid) {
                count = arr[i];
                k++;
            }

            if (student < k) {
                return false;
            }
        }

        return true;
    }

    public static int findPages(int arr[], int n, int student) {
        if (n < student) {
            return -1;
        }

        int sum = 0;
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
            int mid = start + (end - start) / 2;
            if (isValid(arr, n, student, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}
