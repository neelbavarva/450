public class Solution {

    static int sum = 0;

    public int solve(int[] arr, int B) {
        sum = 0;
        int n = arr.length;

        int leftSum = 0;

        for (int i = 0; i < B; i++) {
            leftSum += arr[i];
        }

        sum = leftSum;

        int j = n - 1;
        int i = B - 1;

        while (j >= 0 && i >= 0) {
            leftSum -= arr[i--];
            leftSum += arr[j--];

            sum = Math.max(sum, leftSum);
        }

        return sum;
    }

}
