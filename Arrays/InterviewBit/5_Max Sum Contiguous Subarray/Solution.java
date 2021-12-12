public class Solution {
    public int maxSubArray(final int[] arr) {
        int maxTill = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(current + arr[i], arr[i]);
            maxTill = Math.max(maxTill, current);
        }

        return maxTill;
    }
}
