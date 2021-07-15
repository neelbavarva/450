import java.util.*;

public class Solution {
    long maxSum(long arr[], int n) {

        long sum = 0;
        Arrays.sort(arr);
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            list.add(arr[i]);
            list.add(arr[n - i - 1]);
        }

        if (n % 2 == 1) {
            list.add(arr[n / 2]);
        }

        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(list.get(i) - list.get(i + 1));
        }

        sum += Math.abs(list.get(0) - list.get(n - 1));

        return sum;

    }
}
