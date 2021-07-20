import java.util.*;

public class Solution {
    public String findSubString(String str) {

        int count[] = new int[256];
        int s = 0;

        for (char a : str.toCharArray()) {
            if (count[a] == 0) {
                s++;
                count[a]++;
            }
        }

        int c = 0;

        String res = "";
        int len = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            if (--count[str.charAt(right)] >= 0) {
                c++;
            }

            while (c == s) {
                if (len > right - left + 1) {
                    len = right - left + 1;
                    res = str.substring(left, right + 1);
                }

                if (++count[str.charAt(left)] > 0) {
                    c--;
                }

                left++;
            }
        }

        return res;
    }
}
