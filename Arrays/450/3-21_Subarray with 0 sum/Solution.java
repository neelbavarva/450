public class Solution {
    static boolean findsum(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }

        return false;
    }
}
