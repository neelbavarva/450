public class Solution {
    static public long solve(String s) {
        int mod = 1000000007;

        long arr[] = new long[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        long ans = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans = (ans * arr[i]) % mod;
            }
        }

        return ans;
    }
}
