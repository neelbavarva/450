public class Solution {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void Push(int x) {
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        s2.push(x);

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }

    int Pop() {
        if (s2.isEmpty()) {
            return -1;
        }
        return s2.pop();
    }
}
