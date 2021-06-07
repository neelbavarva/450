public class Solution {
    static int mod = 1000000007;

    public static int findCatalan(int n) {

        long catalan[] = new long[n + 2];

        catalan[0] = 1;
        catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += (catalan[j] * catalan[i - j - 1]) % mod;
            }
        }

        return (int) catalan[n] % mod;

    }
}
