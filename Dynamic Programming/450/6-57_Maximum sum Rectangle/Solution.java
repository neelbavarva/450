public class Solution {
    int kadene(int arr[], int n) {

        int current = arr[0];
        int tillNow = arr[0];
        for (int i = 1; i < n; i++) {
            tillNow = Math.max(arr[i], tillNow + arr[i]);
            current = Math.max(tillNow, current);
        }

        return current;

    }

    int maximumSumRectangle(int R, int C, int M[][]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < R; i++) {
            int ans[] = new int[C];
            for (int j = i; j < R; j++) {
                for (int col = 0; col < C; col++) {
                    ans[col] += M[j][col];
                }

                max = Math.max(max, kadene(ans, C));
            }
        }

        return max;

    }
}
