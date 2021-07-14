import java.util.Stack;

public class Solution {
    public static long[] rightSmallest(long[] arr, long n) {
        Stack<Integer> stack = new Stack<>();
        long max[] = new long[(int) n];
        for (int i = (int) n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                max[i] = n;
            } else {
                max[i] = stack.peek();
            }

            stack.add(i);
        }

        return max;
    }

    public static long[] leftSmallest(long[] arr, long n) {
        Stack<Integer> stack = new Stack<>();
        long max[] = new long[(int) n];
        for (int i = 0; i < (int) n; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                max[i] = -1;
            } else {
                max[i] = stack.peek();
            }

            stack.add(i);
        }

        return max;
    }

    public static long getMaxArea(long hist[], long n) {
        long left[] = leftSmallest(hist, n);
        long right[] = rightSmallest(hist, n);

        long max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, (Math.abs(right[i] - left[i] - 1) * hist[i]));
        }

        return max;

    }
}
