public class Solution {
    static int trappingWater(int arr[], int n) {

        int capacity = 0;
        int lmax = arr[0];
        int rmax = arr[n - 1];

        int l = 0;
        int r = n - 1;

        while (l < r) {
            lmax = lmax < arr[l] ? arr[l] : lmax;
            rmax = rmax < arr[r] ? arr[r] : rmax;

            capacity += (lmax > rmax) ? rmax - arr[r--] : lmax - arr[l++];

        }

        return capacity;

    }
}
