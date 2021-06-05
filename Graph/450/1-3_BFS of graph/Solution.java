public class Solution {
    public ArrayList<Integer> bfsOfGraph(int N, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);

        while (!queue.isEmpty()) {
            int current = queue.remove();

            if (visited[current]) {
                continue;
            }

            list.add(current);
            visited[current] = true;

            for (int i : adj.get(current)) {
                if (visited[i] == false) {
                    queue.add(i);
                }
            }
        }

        return list;
    }
}
