public class Solution {
    long maxProduct(int[] arr, int n) {
        long ans = arr[0];
        long maxP = arr[0];
        long minP = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                long temp = maxP;
                maxP = minP;
                minP = temp;
            }

            maxP = Math.max(arr[i], maxP * arr[i]);
            minP = Math.min(arr[i], minP * arr[i]);
            ans = Math.max(ans, maxP);
        }

        return ans;
    }
}
