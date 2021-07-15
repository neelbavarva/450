import java.util.*;

public class Solution {
    int Maximize(int arr[], int n) {
        Arrays.sort(arr);
        long mod = 1000000007;
        long sum = 0;
        for (long i = 0; i < n; i++) {
            sum = (sum + (long) arr[(int) i] * i) % mod;
        }
        return (int) sum;
    }
}
