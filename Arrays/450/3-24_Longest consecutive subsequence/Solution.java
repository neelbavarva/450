public class Solution {
    static int findLongestConseqSubseq(int arr[], int N) {
        Arrays.sort(arr);

        int max = 1;
        int current = 1;
        for (int i = 0; i < N - 1; i++) {

            if (arr[i + 1] == arr[i] + 1) {
                current++;
            }

            if (!(arr[i + 1] == arr[i] + 1 || arr[i + 1] == arr[i])) {
                current = 1;
            }

            if (current > max) {
                max = current;
            }
        }

        return max;
    }
}
