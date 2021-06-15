public class Solution {
    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> stack = new Stack<>();
        long max[] = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                max[i] = -1;
            } else {
                max[i] = stack.peek();
            }

            stack.add(arr[i]);
        }

        return max;
    }
}
