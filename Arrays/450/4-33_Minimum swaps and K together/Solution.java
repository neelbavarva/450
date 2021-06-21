public class Solution {

    // Using Window

    public static int count(int arr[], int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j; l++) {
            if (arr[l] <= k) {
                count++;
            }
        }

        return count;
    }

    public static int minSwap(int arr[], int n, int k) {
        int window = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                window++;
            }
        }

        int i = 0;
        int j = window - 1;

        int maxInWindow = 0;

        while (j < n) {
            int count = count(arr, i, j, k);
            if (count > maxInWindow) {
                maxInWindow = count;
            }
            i++;
            j++;
        }

        return window - maxInWindow;
    }
}
