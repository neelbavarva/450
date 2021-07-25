import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // non working
    static int maxEvents(int[] start, int[] end, int N) {

        Pair arr[] = new Pair[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Pair(start[i], end[i]);
        }

        Arrays.sort(arr, new Comparator<Pair>() {
            public int compare(Pair s2, Pair s1) {
                if (s2.x == s1.x) {
                    return s2.y - s1.y;
                }
                return s2.x - s1.x;
            }
        });

        int count = 0;
        int ans[] = new int[arr[N - 1].y + 1];

        for (int i = 0; i < N; i++) {

            int j = arr[i].x;

            while (j <= arr[i].y) {
                if (ans[j - 1] == 0) {
                    ans[j - 1] = 1;
                    count++;
                    break;
                }
                j++;
            }
        }

        return count;

    }
}
