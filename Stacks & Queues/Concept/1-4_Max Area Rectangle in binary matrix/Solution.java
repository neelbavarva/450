public class Solution {
    public static int MAH(int[] arr, int n) {

        // Maximum Area in Histogram

        return 0;
    }

    public static int solve(int[][] matrix, int n) {

        int max = 0;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    arr[j] = 0;
                } else {
                    arr[j] = arr[j] + matrix[i][j];
                }
            }

            max = Math.max(max, MAH(arr, n));
        }
        return max;
    }

}
