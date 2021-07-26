import java.util.*;

public class Solution {
    public String reverse(String S) {
        String ans = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            ans += S.charAt(i);
        }

        return ans;
    }

    public String removeConsecutiveCharacter(String S) {

        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            if (stack.peek() == S.charAt(i)) {
                continue;
            }

            stack.push(S.charAt(i));
        }

        String ans = "";

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return reverse(ans);
    }
}
