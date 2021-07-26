import java.util.*;

public class Solution {
    public static ArrayList<String> list;

    public static String path = "";

    public static boolean isValid(int arr[][], int i, int j, boolean visited[][]) {
        if (i == -1 || i == arr.length || j == -1 || j == arr[0].length || visited[i][j] || arr[i][j] == 0) {
            return false;
        }

        return true;
    }

    public static void solve(int arr[][], int i, int j, boolean visited[][]) {

        if (!isValid(arr, i, j, visited)) {
            return;
        }

        if (i == arr.length - 1 && j == arr[0].length - 1) {
            list.add(path);
            return;
        }

        visited[i][j] = true;

        if (isValid(arr, i + 1, j, visited)) {
            path += 'D';
            solve(arr, i + 1, j, visited);
            path = path.substring(0, path.length() - 1);

        }

        if (isValid(arr, i, j - 1, visited)) {
            path += 'L';
            solve(arr, i, j - 1, visited);
            path = path.substring(0, path.length() - 1);

        }

        if (isValid(arr, i, j + 1, visited)) {
            path += 'R';
            solve(arr, i, j + 1, visited);
            path = path.substring(0, path.length() - 1);

        }

        if (isValid(arr, i - 1, j, visited)) {
            path += 'U';
            solve(arr, i - 1, j, visited);
            path = path.substring(0, path.length() - 1);

        }

        visited[i][j] = false;
    }

    public static ArrayList<String> findPath(int[][] m, int n) {

        list = new ArrayList<>();
        boolean visited[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
            }
        }

        solve(m, 0, 0, visited);

        return list;
    }
}
