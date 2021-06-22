public class Solution {
    static int countSquares(int N) {
        int count = 0;
        int x = (int) Math.sqrt(N);

        if (x * x == N) {
            return x - 1;
        }

        return x;
    }
}
