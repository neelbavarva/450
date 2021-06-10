public class Recursion {
    public int maximizeCuts(int n, int x, int y, int z) {
        if (n <= 0) {
            return 0;
        }

        return 1 + Math.max(maximizeCuts(n - x, x, y, z),
                Math.max(maximizeCuts(n - y, x, y, z), maximizeCuts(n - z, x, y, z)));
    }
}
