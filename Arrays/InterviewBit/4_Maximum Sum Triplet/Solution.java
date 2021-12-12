public class Solution {
    public int solve(int[] arr) {

        int n = arr.length;
        int arrSuf[] = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            arrSuf[i] = Math.max(arrSuf[i + 1], arr[i]);
        }

        int ans = 0;

        TreeSet<Integer> lowerElement = new TreeSet<>();

        lowerElement.add(Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            if (arrSuf[i + 1] > arr[i]) {
                ans = Math.max(arr[i] + lowerElement.lower(arr[i]) + arrSuf[i + 1], ans);
                lowerElement.add(arr[i]);
            }
        }

        return ans;

    }
}
