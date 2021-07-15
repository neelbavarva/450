import java.util.*;

public class Solution {
    public static long maximizeSum(long a[], int n, int k) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0 || k <= 0) {
                break;
            } else {
                a[i] = a[i] * (-1);
                k--;
            }
        }

        Arrays.sort(a);

        if (k % 2 != 0) {
            a[0] = a[0] * (-1);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        return sum;
    }
}
