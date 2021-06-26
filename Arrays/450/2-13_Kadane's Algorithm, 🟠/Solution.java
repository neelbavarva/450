public class Solution {
    public int maxSubarraySum(int arr[], int n) {

        int tillNow = arr[0];
        int current = arr[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(arr[i], current + arr[i]);
            tillNow = Math.max(tillNow, current);
        }

        return tillNow;
    }
}
