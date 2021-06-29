public class Solution {
    static public int find_median(int[] arr) {
        Arrays.sort(arr);

        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }

        return arr[arr.length / 2];
    }
}
