import java.util.*;

public class Solution {
    public static String swapPair(String str, int i, int j) {

        char arr[] = str.toCharArray();

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        String ans = "";

        for (int k = 0; k < arr.length; k++) {
            ans += arr[k];
        }

        return ans;
    }

    static List<String> list;

    static public void solve(String s, int i) {
        if (i == s.length()) {
            list.add(s);
            return;
        }

        for (int j = i; j < s.length(); j++) {
            String res = swapPair(s, i, j);
            solve(res, i + 1);
        }
    }

    static public List<String> find_permutation(String S) {

        list = new ArrayList<>();
        solve(S, 0);

        Collections.sort(list);
        return list;
    }
}
