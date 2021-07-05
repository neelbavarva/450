public class Solution {
    public ArrayList<Integer> bfsOfGraph(int N, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(0);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (visited.contains(current)) {
                continue;
            }

            list.add(current);
            visited.add(current);

            for (int neighbour : adj.get(current)) {
                if (!visited.contains(neighbour)) {
                    queue.add(neighbour);
                }
            }

        }

        return list;
    }
}
