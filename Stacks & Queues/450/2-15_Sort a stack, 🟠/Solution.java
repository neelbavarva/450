import java.util.Stack;

public class Solution {
    static public void insert(Stack<Integer> s, int x) {
        if (!s.isEmpty()) {
            if (x < s.peek()) {
                int temp = s.pop();
                insert(s, x);
                s.push(temp);
            } else {
                s.push(x);
            }
        } else {
            s.push(x);
        }
    }

    static public Stack<Integer> sort(Stack<Integer> s) {
        if (s.size() > 0) {
            int temp = s.pop();
            sort(s);
            insert(s, temp);
        }

        return s;
    }
}
