public class Recursion {
    public int solve(int cost[], int n, int w) {

        if (w == 0) {
            return 0;
        }

        if (n <= 0 || w < 0) {
            return -1;
        }

        if (n > w || cost[n - 1] == -1) {
            return solve(cost, n - 1, w);

        } else {

            int include = solve(cost, n, w - n);
            int exclude = solve(cost, n - 1, w);

            if (include == -1 || exclude == -1) {
                if (include == -1 && exclude == -1) {
                    return -1;
                } else if (include == -1) {
                    return exclude;
                } else {
                    return include + cost[n - 1];
                }
            } else {
                return Math.min(cost[n - 1] + include, exclude);
            }

        }
    }

    public int minimumCost(int cost[], int n, int w) {
        return solve(cost, n, w);
    }
}
