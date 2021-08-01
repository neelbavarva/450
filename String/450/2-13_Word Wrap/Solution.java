public class Solution {
    public int solveWordWrap(int[] nums, int k) {
        int n = nums.length;

        int space[][] = new int[n + 1][n + 1];
        int ls[][] = new int[n + 1][n + 1];
        int c[] = new int[n + 1];
        int p[] = new int[n + 1]; // For Paths

        for (int i = 1; i <= n; i++) {
            space[i][i] = k - nums[i - 1];
            for (int j = i + 1; j <= n; j++) {
                space[i][j] = space[i][j - 1] - nums[j - 1] - 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (space[i][j] < 0) {
                    ls[i][j] = Integer.MAX_VALUE;
                } else if (j == n && space[i][j] >= 0) {
                    ls[i][j] = 0;
                } else {
                    ls[i][j] = space[i][j] * space[i][j];
                }
            }
        }

        c[0] = 0;

        for (int i = 1; i <= n; i++) {
            c[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= i; j++) {
                if ((c[j - 1] != Integer.MAX_VALUE) && (ls[j][i] != Integer.MAX_VALUE)
                        && (c[i] > c[j - 1] + ls[j][i])) {
                    c[i] = c[j - 1] + ls[j][i];
                    p[i] = j; // For Paths
                }
            }
        }

        return c[n];

    }
}
