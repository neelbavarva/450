public class Solution {
    public int maxChainLength(Pair arr[], int n) {

        Arrays.sort(arr, new Comparator<Pair>() {
            public int compare(Pair s1, Pair s2) {
                return s1.y - s2.y;
            }
        });

        int count = 1;
        int prev = arr[0].y;
        for (int i = 1; i < n; i++) {
            if (prev < arr[i].x) {
                count++;
                prev = arr[i].y;
            }
        }

        return count;

    }
}
