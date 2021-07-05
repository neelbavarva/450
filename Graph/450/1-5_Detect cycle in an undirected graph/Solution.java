public class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < V; i++) {
            if (!visited.contains(i)) {
                if (isCycle(i, -1, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isCycle(int node, int parent, ArrayList<ArrayList<Integer>> adj, Set<Integer> visited) {
        visited.add(node);

        for (int i : adj.get(node)) {

            if (!visited.contains(i)) {

                if (isCycle(i, node, adj, visited)) {
                    return true;
                }
            } else if (i != parent || i == node) {
                return true;
            }

        }

        return false;
    }
}
