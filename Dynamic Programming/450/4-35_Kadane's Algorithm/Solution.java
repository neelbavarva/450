public class Solution {
    int maxSubarraySum(int arr[], int n) {

        int current = arr[0];
        int tillNow = arr[0];
        for (int i = 1; i < n; i++) {
            tillNow = Math.max(arr[i], tillNow + arr[i]);
            current = Math.max(tillNow, current);
        }

        return current;

    }
}
