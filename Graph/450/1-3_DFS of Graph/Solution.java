import java.io.*;
import java.util.*;

public class Solution {

    public ArrayList<Integer> dfsOfGraph(int N, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        dfsOfGraph(0, adj, new HashSet<>(), list);

        return list;
    }

    public void dfsOfGraph(int N, ArrayList<ArrayList<Integer>> adj, Set<Integer> visited, ArrayList<Integer> list) {
        list.add(N);
        visited.add(N);

        for (int node : adj.get(N)) {
            if (!visited.contains(node)) {
                dfsOfGraph(node, adj, visited, list);
            }
        }
    }
}
