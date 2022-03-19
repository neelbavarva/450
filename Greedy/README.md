| Problem  | Difficulty | Category | Level |
| ------------- | ------------- | ------------- | ------------- |
| <a href="https://leetcode.com/problems/jump-game-ii/">Jump Game II</a>  | Medium  | | Method |
| <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">Best Time to Buy and Sell Stock II</a>  | Medium  | | Method |
| <a href="https://leetcode.com/problems/remove-duplicate-letters/">Remove Duplicate Letters</a>  | Medium  | | OP Simple solution |


### N Meetings in a Room

```
class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int p = 0;
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int d = 1; d <= 100000; d++) {
            while (p < n && events[p][0] == d) {
                pq.add(events[p][1]);
                p++;
            }
            while (!pq.isEmpty()) {
                int r = pq.poll();
                if (r < d)
                    continue;
                ans++;
                break;
            }
        }
        return ans;
    }
}
```
