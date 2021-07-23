import java.util.Stack;

public class Recursion {
    static public int solve(int arr[], int i, Stack<Integer> visited, int count) {

        if (i > arr.length - 1) {
            return count;
        }

        if (i < 0 || visited.contains(arr[i])) {
            return Integer.MAX_VALUE;
        }

        visited.add(arr[i]);
        return Math.min(solve(arr, i - 1, visited, count + arr[i]), solve(arr, i + 2, visited, count + arr[i]));
    }
}
