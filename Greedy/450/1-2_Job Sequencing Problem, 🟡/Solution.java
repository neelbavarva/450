public class Solution {
    static public int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, new Comparator<Job>() {
            public int compare(Job s1, Job s2) {
                return s2.profit - s1.profit;
            }
        });

        int maxDeadLine = 0;

        for (int i = 0; i < n; i++) {
            if (maxDeadLine < arr[i].deadline) {
                maxDeadLine = arr[i].deadline;
            }
        }

        int check[] = new int[maxDeadLine];

        for (int i = 0; i < maxDeadLine; i++) {
            check[i] = 0;
        }

        int count = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, arr[i].deadline - 1); j >= 0; j--) {
                if (check[j] == 0) {
                    count++;
                    total += arr[i].profit;
                    check[j] = -1;
                    break;
                }
            }
        }

        int ans[] = new int[2];
        ans[0] = count;
        ans[1] = total;

        return ans;
    }
}
