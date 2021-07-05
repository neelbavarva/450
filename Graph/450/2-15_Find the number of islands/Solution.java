public class Solution {
    public void dfs(int i, int j, boolean[][] visited, char[][] grid, int N, int M) {

        if (i < 0 || j < 0 || i >= N || j >= M) {
            return;
        }

        if (grid[i][j] == '0') {
            return;
        }

        if (!visited[i][j]) {
            visited[i][j] = true;
            dfs(i + 1, j, visited, grid, N, M);
            dfs(i, j + 1, visited, grid, N, M);
            dfs(i - 1, j, visited, grid, N, M);
            dfs(i, j - 1, visited, grid, N, M);
            dfs(i + 1, j + 1, visited, grid, N, M);
            dfs(i - 1, j - 1, visited, grid, N, M);
            dfs(i + 1, j - 1, visited, grid, N, M);
            dfs(i - 1, j + 1, visited, grid, N, M);
        }
    }

    public int numIslands(char[][] grid) {
        int N = grid.length;
        int M = grid[0].length;

        boolean visited[][] = new boolean[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = false;
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, visited, grid, N, M);
                    count++;
                }
            }
        }

        return count;

    }
}
