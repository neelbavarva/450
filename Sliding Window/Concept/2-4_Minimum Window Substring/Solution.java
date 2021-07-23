import java.util.*;

public class Solution {

    public static String smallestWindow(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            if (map.containsKey(p.charAt(i))) {
                map.replace(p.charAt(i), map.get(p.charAt(i)) + 1);
            } else {
                map.put(p.charAt(i), 1);
            }
        }

        int i = 0;
        int j = 0;
        int count = map.size();

        int index1 = 0;
        int index2 = 0;

        int window = Integer.MAX_VALUE;

        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.replace(s.charAt(j), map.get(s.charAt(j)) - 1);
            }

            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) == 0) {
                count--;
            }

            if (count == 0) {
                while (count == 0) {

                    if (window > j - i) {
                        window = j - i;
                        index2 = j;
                        index1 = i;
                    }

                    if (map.containsKey(s.charAt(i))) {
                        map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
                    }

                    if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > 0) {
                        count++;
                    }

                    i++;

                }
            }

            j++;
        }

        if (window != Integer.MAX_VALUE) {
            return s.substring(index1, index2 + 1);
        } else {
            return "-1";
        }
    }
}
