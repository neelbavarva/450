import java.io.*;
import java.util.*;

public class Solution {

    static public int solve(String s, int k) {

        int i = 0;
        int j = 0;
        int ans = -1;
        Map<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }

                    i++;
                }

                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        String s = "aabacebebebe";

        System.out.println(solve(s, 3));
    }

}
