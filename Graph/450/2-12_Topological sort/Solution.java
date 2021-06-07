public class Solution {

    static void solve(int node, Set<Integer> visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);

        for (int i : adj.get(node)) {
            solve(i, visited, stack, adj);
        }

        stack.push(node);
    }

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < V; i++) {
            solve(i, visited, stack, adj);
        }

        int arr[] = new int[stack.size()];
        int index = 0;

        while (!stack.isEmpty()) {
            arr[index] = stack.pop();
            index++;
        }

        return arr;

    }
}
