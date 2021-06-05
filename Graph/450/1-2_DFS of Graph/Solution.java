public class Solution {

    public ArrayList<Integer> dfsOfGraph(int N, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[N];
        DFS(0, visited, list, adj);

        return list;

    }

    public void DFS(int node, boolean[] visited, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> adj) {

        visited[node] = true;
        list.add(node);

        for (int i : adj.get(node)) {
            if (visited[i] == false) {
                DFS(i, visited, list, adj);
            }
        }
    }
}
