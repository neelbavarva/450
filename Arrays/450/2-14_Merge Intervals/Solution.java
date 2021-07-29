public class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ls = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < intervals.length; i++) {

            if (i < intervals.length - 1 && intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];

                if (intervals[i + 1][1] < intervals[i][1]) {
                    intervals[i + 1][1] = intervals[i][1];
                }

            } else {
                ls.add(intervals[i]);
            }
        }

        int res[][] = new int[ls.size()][2];

        for (int i = 0; i < ls.size(); i++) {
            res[i] = ls.get(i);
        }

        return res;
    }
}
