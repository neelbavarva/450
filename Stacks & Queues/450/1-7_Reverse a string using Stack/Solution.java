public class Solution {
    public String reverse(String S) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}
