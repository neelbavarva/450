import java.io.*;
import java.util.*;

public class Solution {

    static public int solve(String s) {

        int i = 0;
        int j = 0;
        int ans = -1;
        Map<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }

                    i++;
                }

                j++;
            } else if (map.size() == j - i + 1) {
                ans = Math.max(ans, j - i + 1);
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        String s = "pwwkew";

        System.out.println(solve(s));
    }

}
