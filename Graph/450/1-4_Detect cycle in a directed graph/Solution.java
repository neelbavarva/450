public class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        Set<Integer> all = new HashSet<>();
        Set<Integer> visiting = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < V; i++) {
            all.add(i);
        }

        for (int i = 0; i < V; i++) {
            if (hasCycle(i, adj, all, visiting, visited)) {
                return true;
            }
        }

        return false;

    }

    public boolean hasCycle(int node, ArrayList<ArrayList<Integer>> adj, Set<Integer> all, Set<Integer> visiting,
            Set<Integer> visited) {
        all.remove(node);
        visiting.add(node);

        for (var neigh : adj.get(node)) {
            if (visited.contains(neigh)) {
                continue;
            }

            if (visiting.contains(neigh)) {
                return true;
            }

            if (hasCycle(neigh, adj, all, visiting, visited)) {
                return true;
            }
        }

        visiting.remove(node);
        visited.add(node);

        return false;
    }
}
