public class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            arr[i] += k;
        }

        int min = arr[0];
        int max = arr[n - 1];
        int ans = max - min;

        for (int i = n - 1; i >= 0; i--) {
            arr[i] -= 2 * k;
            if (arr[i] < 0) {
                break;
            }

            if (i > 0) {
                max = Math.max(arr[n - 1], arr[i - 1]);
            } else {
                max = arr[n - 1];
            }

            min = Math.min(arr[0], arr[i]);
            ans = Math.min(ans, max - min);
        }

        return ans;
    }
}
