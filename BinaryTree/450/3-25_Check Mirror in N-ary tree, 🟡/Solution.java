public class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {

        List<Stack<Integer>> s = new ArrayList<>();
        List<Queue<Integer>> q = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            s.add(new Stack<>());
            Queue<Integer> queue = new LinkedList<>();
            q.add(queue);
        }

        for (int i = 0; i < 2 * e; i += 2) {
            s.get(A[i]).push(A[i + 1]);
            q.get(B[i]).add(B[i + 1]);
        }

        for (int i = 1; i <= n; i++) {
            while (!s.get(i).isEmpty() && !q.get(i).isEmpty()) {
                int a = s.get(i).pop();
                int b = q.get(i).poll();

                if (a != b) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
