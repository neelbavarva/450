public class Solution {
    public static int evaluatePostFix(String S) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                stack.push(S.charAt(i) - '0');
            } else {
                int n1 = stack.pop();
                int n2 = stack.pop();

                if (S.charAt(i) == '*') {
                    stack.push(n1 * n2);
                } else if (S.charAt(i) == '/') {
                    stack.push(n2 / n1);
                } else if (S.charAt(i) == '+') {
                    stack.push(n2 + n1);
                } else if (S.charAt(i) == '-') {
                    stack.push(n2 - n1);
                }
            }
        }

        return stack.peek();
    }
}
