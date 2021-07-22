import java.util.*;

public class Solution {
    public static int lenOfLongSubarr(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map'
            // or not
            if (map.containsKey(sum - k)) {

                if (maxLen < (i - map.get(sum - k))) {
                    maxLen = i - map.get(sum - k);
                }
            }
        }

        return maxLen;
    }
}
