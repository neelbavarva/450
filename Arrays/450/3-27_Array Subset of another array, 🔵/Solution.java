public class Solution {
    public String isSubset(long a1[], long a2[], long n, long m) {

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(a1[i]);
        }

        for (int i = 0; i < m; i++) {
            if (!list.contains(a2[i])) {
                return "No";
            }
        }

        return "Yes";
    }
}
