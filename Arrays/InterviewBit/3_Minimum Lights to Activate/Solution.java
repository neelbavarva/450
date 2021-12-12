public class Solution {
    public int solve(int[] arr, int B) {
        int n = arr.length;
        int curr = 0;
        int count = 0;

        while (curr < n) {
            int left = curr - B + 1;
            int right = curr + B - 1;
            right = Math.min(right, n - 1);
            int ind = right;

            left = Math.max(left, 0);

            while (ind >= left) {
                if (arr[ind] == 1) {
                    break;
                }
                ind--;
            }

            if (ind >= left) {
                count++;
                curr = ind + B;
            } else {
                return -1;
            }

        }

        return count;
    }
}
