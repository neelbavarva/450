// Question Link : https://practice.geeksforgeeks.org/problems/mother-vertex/1/?problemStatus=unsolved&difficulty[]=0&page=1&category[]=Graph&query=problemStatusunsolveddifficulty[]0page1category[]Graph

public class Solution {

    // My solution
    public boolean dfsOfGraph(int N, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            DFS(i, visited, list, adj);
            if (list.size() == N) {
                return true;
            }
            list.clear();
        }
        return false;

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

    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {

        for (int i = 0; i < V; i++) {
            boolean isMother = dfsOfGraph(V, adj);
            if (isMother) {
                return i;
            }
        }

        return -1;
    }
}
