public class Solution {

    public boolean hasCycle(int node, boolean[] visited, boolean[] visiting, ArrayList<ArrayList<Integer>> adj) {

        if (visiting[node]) {
            return true;
        }

        if (visited[node]) {
            return false;
        }

        visited[node] = true;
        visiting[node] = true;

        List<Integer> children = adj.get(node);

        for (Integer c : children) {
            if (hasCycle(c, visited, visiting, adj)) {
                return true;
            }
        }

        visiting[node] = false;

        return false;
    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];
        boolean[] visiting = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (hasCycle(i, visited, visiting, adj)) {
                return true;
            }
        }

        return false;
    }
}
