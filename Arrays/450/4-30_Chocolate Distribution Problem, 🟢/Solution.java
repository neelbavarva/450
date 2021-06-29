public class Solution {

    // Sliding Window
    public long findMinDiff(ArrayList<Long> a, long n, long m) {
        Collections.sort(a);
        int i = 0;
        int j = (int) m - 1;

        long max = Integer.MAX_VALUE;
        long ans = Integer.MAX_VALUE;
        while (j < n) {
            max = a.get(j) - a.get(i);
            if (max < ans) {
                ans = max;
            }
            i++;
            j++;
        }

        return ans;
    }
}
