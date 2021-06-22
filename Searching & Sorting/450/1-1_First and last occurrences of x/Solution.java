public class Solution {
    ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> list = new ArrayList<>();
        long a = -1;
        long b = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (a == -1) {
                    a = i;
                } else {
                    b = i;
                }
            }
        }
        if (b == -1) {
            b = a;
        }
        list.add(a);
        list.add(b);
        return list;
    }
}
