import java.util.*;

public class Solution {
    public int minFlips(String S) {

        int first = 0;
        int second = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '1' && i % 2 == 0) {
                first++;
            } else if (S.charAt(i) == '0' && i % 2 != 0) {
                first++;
            } else if (S.charAt(i) == '1' && i % 2 != 0) {
                second++;
            } else if (S.charAt(i) == '0' && i % 2 == 0) {
                second++;
            }
        }

        return Math.min(first, second);
    }
}
