
public class Solution {
    public long firstNeg(long arr[], int i, int j) {
        for (int k = i; k <= j; k++) {
            if (arr[k] < 0) {
                return arr[k];
            }
        }
        return 0;
    }

    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        long arr[] = new long[N - K + 1];
        int i = 0;
        int j = K - 1;

        while (j < N && i < N) {
            arr[i] = firstNeg(A, i, j);
            i++;
            j++;
        }

        return arr;
    }
}
