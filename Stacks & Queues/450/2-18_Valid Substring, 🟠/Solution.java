import java.util.Stack;

public class Solution {

    static int findMaxLen(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (!stack.isEmpty()) {
                    max = Math.max(i - stack.peek(), max);
                } else {
                    stack.push(i);
                }

            }
        }

        return max;
    }
}
