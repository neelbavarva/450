public class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
        int[][] A = new int[N][2];

        for (int i = 0; i < N; i++) {
            A[i][0] = start[i];
            A[i][1] = end[i];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Arrays.sort(A, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0, res = 0, d = 0;
        while (!pq.isEmpty() || i < N) {
            if (pq.isEmpty())
                d = A[i][0];
            while (i < N && A[i][0] <= d)
                pq.offer(A[i++][1]);
            pq.poll();
            ++res;
            ++d;
            while (!pq.isEmpty() && pq.peek() < d)
                pq.poll();
        }
        return res;
    }
}
