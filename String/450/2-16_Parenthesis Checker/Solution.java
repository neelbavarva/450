import java.util.*;

public class Solution {
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '(') {
                stack.push(x.charAt(i));
            } else if (!stack.isEmpty() && x.charAt(i) == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (!stack.isEmpty() && x.charAt(i) == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (!stack.isEmpty() && x.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
