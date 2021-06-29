public class Solution {
    public static int sb(int arr[], int n, int x) {

        int current_sum = 0;
        int min_length = n + 1;

        int start = 0;
        int end = 0;

        while (end < n) {

            while (current_sum <= x && end < n) {
                current_sum += arr[end];
                end++;
            }

            while (current_sum > x && start < n) {
                if (end - start < min_length) {
                    min_length = end - start;
                }

                current_sum -= arr[start];
                start++;
            }
        }

        return min_length;
    }
}
