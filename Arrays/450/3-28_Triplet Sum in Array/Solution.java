public class Solution {
    public static boolean find3Numbers(int arr[], int n, int X) {

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int tempSum = X - arr[i];
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (arr[l] + arr[r] == tempSum) {
                    return true;
                } else if (arr[l] + arr[r] > tempSum) {
                    r--;
                } else if (arr[l] + arr[r] <= tempSum) {
                    l++;
                }
            }
        }

        return false;

    }
}
