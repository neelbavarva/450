public class Solution {
    public int coverPoints(int[] A, int[] B) {

        int sum = 0;

        if (A.length == 1) {
            return 0;
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                sum += solve(A[i], B[i], A[i + 1], B[i + 1]);
            }
        }

        return sum;
    }

    public int solve(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);

        return Math.max(dx, dy);
    }
}
