public class Solution {
    static public long solve(String s) {
        String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char ch[] = pattern.toCharArray();

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch[0]) {
                int p = 1;
                int end = i + 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == ch[p]) {
                        p++;
                        end = j;
                    }

                    if (p == 26) {
                        break;
                    }
                }

                if (p == 26) {
                    ans = Math.min(ans, end - i + 1);
                }
            }
        }

        return ans;

    }
}
